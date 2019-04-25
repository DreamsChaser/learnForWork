package cn.com.git.leon.E_Thread.a_thread.D_join;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class JoinTest {
    public static void main(String[] args) {
        new Thread(new Father()).start();
    }
}
