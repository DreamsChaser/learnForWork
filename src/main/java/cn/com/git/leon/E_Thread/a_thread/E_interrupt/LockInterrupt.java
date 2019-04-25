package cn.com.git.leon.E_Thread.a_thread.E_interrupt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class LockInterrupt implements Runnable{

    private static ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        try {
            reentrantLock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName()+"获得了锁");
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
            System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
        System.out.println("处理其它逻辑");
    }

}

class LockInterruptTest{
    public static void main(String[] args) {
        new Thread(new LockInterrupt(),"线程A").start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB = new Thread(new LockInterrupt(),"线程B");
        threadB.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.interrupt();
    }
}

