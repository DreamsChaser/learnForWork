package cn.com.git.leon.E_Thread.h_concurrentTool.A_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0;i<10;i++) {
            executorService.submit(() -> {
                try {
                    System.out.println(Thread.currentThread().getName()+"开始执行");
                    long timeOut = (long) (Math.random()*10);
                    TimeUnit.SECONDS.sleep(timeOut);
                    System.out.println(timeOut+"秒"+Thread.currentThread().getName()+"ok了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName()+"线程继续向下跑");
            });
        }
        System.out.println("卡在这里");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("程序结束");
    }

}
