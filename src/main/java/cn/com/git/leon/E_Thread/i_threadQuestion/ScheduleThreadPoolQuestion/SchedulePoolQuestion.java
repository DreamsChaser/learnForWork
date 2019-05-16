package cn.com.git.leon.E_Thread.i_threadQuestion.ScheduleThreadPoolQuestion;

import java.util.concurrent.*;

/**
 * 假如有一个第三方接口，有很多个线程去调用获取数据，
 * 现在规定每秒钟最多有 10 个线程同时调用它，如何做到。
 * @author sirius
 * @since 2019/5/16
 */
public class SchedulePoolQuestion {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我执行了");
            }
        };
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        executor.scheduleAtFixedRate(runnable,5L,2L,TimeUnit.SECONDS);
    }

}
