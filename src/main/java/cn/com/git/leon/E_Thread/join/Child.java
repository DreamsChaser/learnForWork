package cn.com.git.leon.E_Thread.join;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class Child implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*2);
            System.out.println("我是子线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
