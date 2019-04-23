package cn.com.git.leon.E_Thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author sirius
 * @since 2019/4/2
 */
public class ReadLockDemo implements Runnable{

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    @Override
    public void run() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"获得了锁");
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName()+"执行任务成功");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
            System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
    }
}
