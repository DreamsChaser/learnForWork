package cn.com.git.leon.E_Thread.g_threadCommunicate;

import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class WaitAndNotify {
}


class Good implements Runnable{

    private static Object object = new Object();

    @Override
    public void run() {
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"获得了锁");
            try {
                TimeUnit.SECONDS.sleep(2);
                if (Thread.currentThread().getName().equals("A")) {
                    System.out.println("A wait");
                    object.wait();
                    System.out.println("A 被唤醒");
                }else {
                    System.out.println("B 通知");
                    object.notify();
                    System.out.println("B通知结束");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束");
        }
    }
}

class WaitAndNotifyTest{
    public static void main(String[] args) {
        new Thread(new Good(),"A").start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Good(),"B").start();
    }
}