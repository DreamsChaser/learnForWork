package cn.com.git.leon.E_Thread.e_blockQueue.B_LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author sirius
 * @since 2019/4/25
 */
public class LinkedBlockingQueueDemo {

    public static void main(String[] args) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        try {
            linkedBlockingQueue.put("a");
            linkedBlockingQueue.put("b");
            linkedBlockingQueue.put("c");
            linkedBlockingQueue.take();
            linkedBlockingQueue.take();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
