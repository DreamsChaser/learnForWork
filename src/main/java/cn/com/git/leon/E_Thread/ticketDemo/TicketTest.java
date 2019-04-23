package cn.com.git.leon.E_Thread.ticketDemo;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket,"人工窗口1");
        Thread thread2 = new Thread(ticket,"人工窗口2");
        Thread thread3 = new Thread(ticket,"人工窗口3");
        Thread thread4 = new Thread(ticket,"人工窗口4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
