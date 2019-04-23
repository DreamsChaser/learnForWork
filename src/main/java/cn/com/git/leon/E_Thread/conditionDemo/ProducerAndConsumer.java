package cn.com.git.leon.E_Thread.conditionDemo;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class ProducerAndConsumer {

    private static ReentrantLock lock = new ReentrantLock();

    private static int balance = 20;

    private static int num = 1;

    private static int earn = 0;

    public static void main(String[] args) {
        Condition coco = lock.newCondition();
        ExecutorService producer = Executors.newCachedThreadPool();
        producer.submit((Runnable) () -> {
            while (true) {
                if (earn >= 20){
                    break;
                }
                lock.lock();
                try {
                    if (num == 1) {
                        coco.await();
                        earn = earn + 10;
                        System.out.println("卖出一瓶可乐，今天收益"+earn+"元");
                    } else if (num == 0) {
                        TimeUnit.SECONDS.sleep(2);
                        num = num + 1;
                        System.out.println("生产了一瓶可乐");
                        coco.signal();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        producer.shutdown();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ExecutorService consumer = Executors.newCachedThreadPool();
        consumer.submit((Runnable) () -> {
            while (true) {
                if (balance <= 0){
                    break;
                }
                lock.lock();
                try {
                    if (num == 0) {
                        coco.await();
                    } else if (num == 1){
                        TimeUnit.SECONDS.sleep(2);
                        num = num - 1;
                        balance = balance - 10;
                        System.out.println("买走了一瓶可乐,还剩"+balance+"元");
                        coco.signal();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        consumer.shutdown();
    }
}
