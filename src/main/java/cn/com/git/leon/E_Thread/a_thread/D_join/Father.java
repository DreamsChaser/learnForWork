package cn.com.git.leon.E_Thread.a_thread.D_join;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class Father implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*2);
            System.out.println("join之前");
            Thread thread = new Thread(new Child());
            thread.start();
            thread.join();
            System.out.println("join之后");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
