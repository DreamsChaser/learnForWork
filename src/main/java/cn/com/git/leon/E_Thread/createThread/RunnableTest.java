package cn.com.git.leon.E_Thread.createThread;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class RunnableTest {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        for (int i = 0;i<100;i++){
            new Thread(runnableDemo," 线程测试"+i).start();
        }
    }
}
