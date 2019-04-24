package cn.com.git.leon.E_Thread.a_thread.B_ticketDemo;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class Ticket implements Runnable{

    int num = 100;

    @Override
    public void run() {
        while (num > 0) {
            synchronized (this) {
                if (num > 0) {
                    try {
                        Thread.sleep(10 * 5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出了一张");
                    num--;
                    System.out.println("还剩" + num + "张");
                }
            }
        }
    }
}
