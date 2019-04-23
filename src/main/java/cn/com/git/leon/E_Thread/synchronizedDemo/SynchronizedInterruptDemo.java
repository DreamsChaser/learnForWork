package cn.com.git.leon.E_Thread.synchronizedDemo;

/**
 * @author sirius
 * @since 2019/4/2
 */
public class SynchronizedInterruptDemo implements Runnable{

    @Override
    public synchronized void run() {
        while (true){
            if (Thread.currentThread().isInterrupted()){
                break;
            }
            System.out.println("未被中断");
        }
        System.out.println("线程被中断了");
    }
}
