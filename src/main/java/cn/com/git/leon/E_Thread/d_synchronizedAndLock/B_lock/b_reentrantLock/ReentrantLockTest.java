package cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.b_reentrantLock;

import cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.b_reentrantLock.ReentrantLockDemo;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLockDemo lockDemo = new ReentrantLockDemo();
        Thread thread1 = new Thread(lockDemo,"窗口1");
        Thread thread2 = new Thread(lockDemo,"窗口2");
        Thread thread3 = new Thread(lockDemo,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
