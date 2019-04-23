package cn.com.git.leon.E_Thread.ThreadPoolDemo;

import java.util.concurrent.*;

/**
 * @author sirius
 * @since 2019/4/9
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        Runnable runnable1 = () -> System.out.println("我是线程1 我先执行");
        Runnable runnable2 = () -> System.out.println("我是线程2 我10s后再执行");
        executorService.schedule(runnable1,0L,TimeUnit.SECONDS);
        executorService.schedule(runnable2,10L,TimeUnit.SECONDS);
        executorService.shutdown();
    }
}
