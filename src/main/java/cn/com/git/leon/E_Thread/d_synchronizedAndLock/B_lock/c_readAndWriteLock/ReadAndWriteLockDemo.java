package cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.c_readAndWriteLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author sirius
 * @since 2019/4/3
 */
public class ReadAndWriteLockDemo implements Runnable{

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public void run() {
//        writeRead();
        readWrite();
    }

    private void writeRead(){
        if (Thread.currentThread().getName().equals("诵明月之诗")){
            lock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName()+"获得了写锁");
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"执行完了任务");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.writeLock().unlock();
                System.out.println(Thread.currentThread().getName()+"释放了写锁");
            }
        }else if (Thread.currentThread().getName().equals("歌窈窕之章")){
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+"获得了读锁");
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"执行完了任务");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.readLock().unlock();
                System.out.println(Thread.currentThread().getName()+"释放了读锁");
            }
        }
    }

    private void readWrite(){
        if (Thread.currentThread().getName().equals("诵明月之诗")){
            lock.readLock().lock();
            try {
                System.out.println(Thread.currentThread().getName()+"获得了读锁");
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"执行完了任务");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.readLock().unlock();
                System.out.println(Thread.currentThread().getName()+"释放了读锁");
            }
        }else if (Thread.currentThread().getName().equals("歌窈窕之章")){
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+"获得了写锁");
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"执行完了任务");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.writeLock().unlock();
                System.out.println(Thread.currentThread().getName()+"释放了写锁");
            }
        }
    }
}
