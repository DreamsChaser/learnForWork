package cn.com.git.leon.E_Thread.ThreadPoolDemo.shutdownAndshutdownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/9
 */
public class ShutdownNowDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是"+Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println("我被打断了"+Thread.currentThread().getName());
                }
                System.out.println("我好了"+Thread.currentThread().getName());
            }
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(runnable);
        executorService.shutdownNow();
        System.out.println("线程池已经关闭了");
    }
}
