package cn.com.git.leon.E_Thread.synchronizedDemo;

import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/2
 */
public class SynchronizedInterruptTest {
    public static void main(String[] args) {
        SynchronizedInterruptDemo synchronizedInterruptDemo = new SynchronizedInterruptDemo();
        Thread thread = new Thread(synchronizedInterruptDemo,"线程测试");
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
