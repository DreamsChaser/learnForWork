package cn.com.git.leon.E_Thread.createThread;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*5);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
