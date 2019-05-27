package cn.com.git.leon.E_Thread.e_blockQueue.E_SynchronousQueue;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class SynchronousQueueDemo {

    static int count = 0;

    public static void main(String[] args) {
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<Integer>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        int i = (int) (Math.random() * 10);
                        System.out.println("线程睡" + i);
                        TimeUnit.SECONDS.sleep(i);
                        synchronousQueue.put(i);
                        count++;
                        System.out.println("第"+count+"次放入"+i);
                        if (count == 10){
                            break;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        int i = synchronousQueue.take();
                        System.out.println("第"+count+"次取出"+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (count == 10){
                        break;
                    }
                }
            }
        }).start();
    }
}
