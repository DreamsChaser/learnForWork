package cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.c_readAndWriteLock;

/**
 * @author sirius
 * @since 2019/4/3
 */
public class ReadLockTest {

    public static void main(String[] args) {
        ReadLockDemo readLockDemo = new ReadLockDemo();
        new Thread(readLockDemo,"线程1").start();
//        new Thread(readLockDemo,"线程2").start();
        System.out.println("结束");

    }
}
