package cn.com.git.leon.E_Thread.a_thread.E_interrupt;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class InterruptLockDemo implements Runnable{

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            this.doService();
        } catch (InterruptedException e) {
            System.out.println("我被中断了");
        }
    }

    private void doService() throws InterruptedException {
        lock.lockInterruptibly();
        System.out.println(Thread.currentThread().getName()+"获得锁");
        try {
            long startTime = System.currentTimeMillis();
            while (true) {
                if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE)
                    break;
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+"释放锁");

        }
    }
}
