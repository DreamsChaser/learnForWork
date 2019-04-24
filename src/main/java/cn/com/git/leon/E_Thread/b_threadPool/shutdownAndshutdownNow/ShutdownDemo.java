package cn.com.git.leon.E_Thread.b_threadPool.shutdownAndshutdownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/9
 */
public class ShutdownDemo {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("我是"+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我好了"+Thread.currentThread().getName());
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(runnable);
        executorService.shutdown();
        System.out.println("线程池已经关闭了");
    }
}
