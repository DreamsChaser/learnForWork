package cn.com.git.leon.E_Thread.BlockQueueDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sirius
 * @since 2019/4/11
 */
public class ArrayBlockingQueueDemo {

    private static volatile AtomicInteger count = new AtomicInteger(0);

    /**
     * 队列中5个消息位置
     */
    private static ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(5);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (count.get() == 10){
                        System.out.println("没消息了");
                        break;
                    }
                    int a = (int) (Math.random()*10);
                    try {
                        arrayBlockingQueue.put(a);
                        count.getAndIncrement();
                        System.out.println("发出了消息"+a);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (arrayBlockingQueue.isEmpty()){
                        break;
                    }
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        Object o = arrayBlockingQueue.take();
                        System.out.println("消费了消息"+o);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
