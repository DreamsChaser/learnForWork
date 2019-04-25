package cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.b_reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class ReentrantLockDemo implements Runnable{

    private Lock lock = new ReentrantLock();

    private static int num = 50;

    @Override
    public void run() {
        while (num > 0) {
            lock.lock();
            try {
                Thread.sleep(200);
                if (num > 0) {
                    num--;
                    System.out.println(Thread.currentThread().getName() + "卖出1张票，还剩"+num+"张");
                } else {
                    System.out.println(Thread.currentThread().getName() + "票已经售完");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
