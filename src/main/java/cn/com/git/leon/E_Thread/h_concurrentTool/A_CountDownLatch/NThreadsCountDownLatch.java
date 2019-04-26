package cn.com.git.leon.E_Thread.h_concurrentTool.A_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sirius
 * @since 2019/4/26
 */
public class NThreadsCountDownLatch {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    private static volatile AtomicInteger result = new AtomicInteger(0);
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println("我是总任务A,等待支线任务完成");
                countDownLatch.await();
                System.out.println("总任务A开始进行.....");
                result.getAndIncrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            try {
                System.out.println("我是总任务B,等待支线任务完成");
                countDownLatch.await();
                System.out.println("总任务B开始进行....");
                result.getAndIncrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("支线任务a开始进行");
                TimeUnit.SECONDS.sleep(1);
                countDownLatch.countDown();
                System.out.println("支线任务a已经结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("支线任务b开始进行");
                TimeUnit.SECONDS.sleep(2);
                countDownLatch.countDown();
                System.out.println("支线任务b已经结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        while (true){
            if (result.get() == 2){
                break;
            }
        }
    }
}