package cn.com.git.leon.E_Thread.d_synchronizedAndLock.B_lock.a_fairLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class FairLockDemo {

    private Lock lock = new ReentrantLock(true);

}
