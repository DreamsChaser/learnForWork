package cn.com.git.leon.E_Thread.lock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class InterruptLockTest {
    public static void main(String[] args) {
        InterruptLockDemo interreptLockDemo = new InterruptLockDemo();
        Thread thread1 = new Thread(interreptLockDemo,"线程1");
        thread1.start();
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(interreptLockDemo,"线程2");
        thread2.start();
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }
}
