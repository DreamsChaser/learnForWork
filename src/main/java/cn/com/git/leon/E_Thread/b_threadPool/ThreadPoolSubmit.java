package cn.com.git.leon.E_Thread.b_threadPool;

import java.util.concurrent.*;

/**
 * @author sirius
 * @since 2019/4/9
 */
public class ThreadPoolSubmit {

    public static void main(String[] args) {
        Callable<Integer> callable = new Callable() {
            int i = 0;
            @Override
            public Integer call() throws Exception {
                i = 1000;
                return i;
            }
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        Integer result = 0;
        for (int i = 0;i<5;i++) {
            Future<Integer> future = executorService.submit(callable);
            try {
                result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }

}
