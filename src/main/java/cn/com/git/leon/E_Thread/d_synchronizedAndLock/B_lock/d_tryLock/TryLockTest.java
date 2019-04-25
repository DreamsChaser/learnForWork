package cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.d_tryLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class TryLockTest {
    public static void main(String[] args) {
        TryLockDemo tryLockDemo = new TryLockDemo();
        Thread thread1 = new Thread(tryLockDemo,"线程1");
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(tryLockDemo,"线程2");
        thread2.start();
    }
}
