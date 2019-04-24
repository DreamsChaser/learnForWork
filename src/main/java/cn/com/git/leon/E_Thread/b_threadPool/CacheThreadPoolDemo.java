package cn.com.git.leon.E_Thread.b_threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/9
 */
public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0;i< 100 ;i++) {
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName()+"开始");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"结束");
            });
        }
        executorService.shutdown();
    }
}
