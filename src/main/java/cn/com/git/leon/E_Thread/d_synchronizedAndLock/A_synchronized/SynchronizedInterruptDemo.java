package cn.com.git.leon.E_Thread.d_synchronizedAndLock.A_synchronized;

import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/2
 */
public class SynchronizedInterruptDemo implements Runnable{

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName()+"开始");
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        while (true){
//            if (Thread.currentThread().isInterrupted()){
//                break;
//            }
//            System.out.println(Thread.currentThread().getName()+"未被中断");
//        }
        System.out.println(Thread.currentThread().getName()+"线程被中断了");
    }
}
