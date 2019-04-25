package cn.com.git.leon.E_Thread.a_thread.E_interrupt;

import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class SynchronizedInterrupt implements Runnable{

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "获得了锁");
            try {
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束了");
        }
        System.out.println(Thread.currentThread().getName()+"释放了锁");
        System.out.println("开始执行别的代码");
    }
}

class SynchronizedInterruptTest{
    public static void main(String[] args) {
        SynchronizedInterrupt synchronizedInterrupt = new SynchronizedInterrupt();
        new Thread(synchronizedInterrupt,"A").start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB = new Thread(synchronizedInterrupt,"B");
        threadB.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("准备打断B");
        threadB.interrupt();
        System.out.println("程序结束");
    }
}
