package cn.com.git.leon.E_Thread.e_blockQueue.B_LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class LinkedBlockingQueueDemo {

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<10;i++)
                    try {
                        linkedBlockingQueue.put(i);
                        System.out.println("放入"+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!linkedBlockingQueue.isEmpty()) {
                        TimeUnit.SECONDS.sleep(2);
                        int i = linkedBlockingQueue.take();
                        System.out.println(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
