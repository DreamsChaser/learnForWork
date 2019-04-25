package cn.com.git.leon.E_Thread.f_atomicDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class atomicAddDemo {

    private static volatile AtomicInteger i = new AtomicInteger(0);

    public static void increase(){
        i.getAndIncrement();
    }

    public static void main(String[] args) {
        for (int m = 0; m < 20; m++) {
            i.set(0);
            CountDownLatch countDownLatch = new CountDownLatch(1000);
            ExecutorService executorService = Executors.newCachedThreadPool();
            for (int n = 0; n < 1000; n++) {
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        increase();
                        countDownLatch.countDown();
                    }
                });
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
            System.out.println(i);
        }
    }
}
