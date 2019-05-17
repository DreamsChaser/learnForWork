package cn.com.git.leon.E_Thread.h_concurrentTool.C_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class SemaphoreDemo2 {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0;i<6;i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        int i = semaphore.availablePermits();
                        System.out.println("现在有"+i+"座位");
                        semaphore.acquire(2);
                        System.out.println(Thread.currentThread().getName()+"占了2个座位");
                        TimeUnit.SECONDS.sleep(5);
                        semaphore.release(2);
                        System.out.println(Thread.currentThread().getName()+"我不占了");
                        int j = semaphore.availablePermits();
                        System.out.println("现在有"+j+"座位");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        System.out.println("线程池已关闭");
//        //直接释放不获取
//        try {
//            TimeUnit.SECONDS.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        semaphore.release();
//        System.out.println(semaphore.availablePermits());
    }

}
