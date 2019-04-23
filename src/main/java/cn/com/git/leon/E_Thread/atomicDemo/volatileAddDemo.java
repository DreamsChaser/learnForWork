package cn.com.git.leon.E_Thread.atomicDemo;

import java.util.concurrent.*;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class volatileAddDemo {

    private static volatile int i = 0;

    public static void increase(){
        i++;
    }

    public static void main(String[] args) {
        for (int m = 0; m < 20; m++) {
            i = 0;
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
