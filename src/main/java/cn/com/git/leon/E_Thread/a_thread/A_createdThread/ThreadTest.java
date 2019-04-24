package cn.com.git.leon.E_Thread.a_thread.A_createdThread;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo2 = new ThreadDemo();
        threadDemo.start();
        threadDemo2.start();

    }
}
