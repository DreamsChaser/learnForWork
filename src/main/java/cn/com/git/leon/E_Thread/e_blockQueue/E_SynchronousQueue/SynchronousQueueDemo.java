package cn.com.git.leon.E_Thread.e_blockQueue.E_SynchronousQueue;

import java.util.concurrent.SynchronousQueue;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        try {
            synchronousQueue.put("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
