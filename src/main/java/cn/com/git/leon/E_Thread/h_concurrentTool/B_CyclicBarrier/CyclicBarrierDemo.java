package cn.com.git.leon.E_Thread.h_concurrentTool.B_CyclicBarrier;

import java.sql.Time;
import java.util.concurrent.*;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i =0;i<10;i++) {
            executorService.submit(() -> {
                try {
                    long timeOut = (long) (Math.random()*10);
                    TimeUnit.SECONDS.sleep(timeOut);
                    System.out.println(timeOut+"秒"+Thread.currentThread().getName()+"被挂起");
                    cyclicBarrier.await();
                    System.out.println("所有任务处理完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
        System.out.println("我好了，下一轮吧");
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
        for (int i =0;i<10;i++) {
            executorService2.submit(() -> {
                try {
                    long timeOut = (long) (Math.random()*10);
                    TimeUnit.SECONDS.sleep(timeOut);
                    System.out.println("第二轮"+timeOut+"秒"+Thread.currentThread().getName()+"被挂起");
                    cyclicBarrier.await();
                    System.out.println("第二轮任务处理完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService2.shutdown();
        System.out.println("这一轮我也好了");

    }
}
