package cn.com.git.leon.E_Thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class TryLockDemo implements Runnable{

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            if (Thread.currentThread().getName().equals("线程1")) {
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"拿到了锁");
                Thread.sleep(1000 * 5);
                lock.unlock();
                System.out.println(Thread.currentThread().getName()+"释放了锁");
            } else {
                //尝试获取锁，获取不到则离开
                if (lock.tryLock(1000*2, TimeUnit.MICROSECONDS)){
                    System.out.println(Thread.currentThread().getName()+"拿到了锁");
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName()+"释放了锁");
                }else {
                    System.out.println(Thread.currentThread().getName()+"没拿到灰溜溜的走开了");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            lock.unlock();
        }

    }
}
