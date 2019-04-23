package cn.com.git.leon.E_Thread.atomicDemo;

import java.util.concurrent.*;

/**
 * 线程之间变量不共享
 * @author sirius
 * @since 2019/4/9
 */
public class UnatomicDemo {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
//            volatile int state = 0;
            int state = 0;
            @Override
            public void run() {
                if ("pool-1-thread-1".equals(Thread.currentThread().getName())){
                    //线程1
                    while (true){
                        if (state == 10)
                        break;
                    }
                    System.out.println("我好了");
                }else if ("pool-1-thread-2".equals(Thread.currentThread().getName())){
                    try {
                        TimeUnit.SECONDS.sleep(5);
                        System.out.println("我来修改状态");
                        state = 10;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName());
            }
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.shutdown();
    }
}
