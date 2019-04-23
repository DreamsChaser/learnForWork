package cn.com.git.leon.E_Thread.createThread;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*5);
            System.out.println("等待结束"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
