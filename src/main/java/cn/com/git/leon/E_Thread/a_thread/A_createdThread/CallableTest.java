package cn.com.git.leon.E_Thread.a_thread.A_createdThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class CallableTest {
    public static void main(String[] args) {
        CallableDemo callableDemo = new CallableDemo();
        FutureTask<Integer> futureTask = new FutureTask(callableDemo);
        FutureTask<Integer> futureTask2 = new FutureTask(callableDemo);
        new Thread(futureTask).start();
        new Thread(futureTask2).start();
        try {
            Integer i = futureTask.get();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
