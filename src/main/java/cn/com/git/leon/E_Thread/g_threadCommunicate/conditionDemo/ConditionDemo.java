package cn.com.git.leon.E_Thread.g_threadCommunicate.conditionDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class ConditionDemo {

    private static Lock lock = new ReentrantLock();

    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    if (Thread.currentThread().getName().equals("pool-1-thread-1")) {
                        System.out.println("我是线程1，我是消费者，现在没货我先等着");
                            condition.await();
                        System.out.println("我醒了，生产者告诉我货来了");
                    } else {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("我造好了，你可以买了");
                            condition.signal();
                            System.out.println("我通知好了");
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0;i<2;i++) {
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }
}
