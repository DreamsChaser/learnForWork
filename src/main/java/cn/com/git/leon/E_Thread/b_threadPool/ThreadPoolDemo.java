package cn.com.git.leon.E_Thread.b_threadPool;

import java.util.concurrent.*;

/**
 * @author sirius
 * @since 2019/4/8
 */
public class ThreadPoolDemo {

    /**
     * 核心线程数
     */
    private static int CORE_POOL_SIZE;
    /**
     * 最大线程数
     */
    private static int MAXIMUM_POOL_SIZE;
    /**
     * 线程空闲时间
     */
    private static long KEEP_ALIVE_TIME;
    private static TimeUnit UNIT;
    /**
     * 阻塞队列
     */
    private static BlockingQueue<Runnable> WORK_QUEUE;
    private static ThreadFactory THREAD_FACTORY;
    /**
     * 拒绝策略
     */
    private static RejectedExecutionHandler HANDLER;

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE,
                        KEEP_ALIVE_TIME, UNIT, WORK_QUEUE);
    }
}
