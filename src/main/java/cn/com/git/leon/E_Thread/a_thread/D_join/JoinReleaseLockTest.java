package cn.com.git.leon.E_Thread.a_thread.D_join;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/5/12
 */
public class JoinReleaseLockTest {

    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    lock.tryLock(60*2, TimeUnit.SECONDS);
                    System.out.println(Thread.currentThread().getName()+"获得了锁");
                    TimeUnit.SECONDS.sleep(3);
                    if (Thread.currentThread().getName().equals("A")){
                        Thread threadC = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    TimeUnit.SECONDS.sleep(2);
                                } catch (InterruptedException e) {

                                }
                                System.out.println("C先占用2s");
                            }
                        });
                        threadC.start();
                        threadC.join();
                    }
                    System.out.println(Thread.currentThread().getName()+"处理完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName()+"释放了锁");
                }
            }
        };
        Thread threadA = new Thread(runnable,"A");
        Thread threadB = new Thread(runnable,"B");
        threadA.start();
        TimeUnit.SECONDS.sleep(1);
        threadB.start();

    }

}
