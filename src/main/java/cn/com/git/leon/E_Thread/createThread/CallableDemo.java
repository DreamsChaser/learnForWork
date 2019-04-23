package cn.com.git.leon.E_Thread.createThread;

import java.util.concurrent.Callable;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class CallableDemo implements Callable<Integer>{

    private static int i;

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000 * 5);
        System.out.println("来了，"+Thread.currentThread().getName());
        i++;
        return i;
    }
}
