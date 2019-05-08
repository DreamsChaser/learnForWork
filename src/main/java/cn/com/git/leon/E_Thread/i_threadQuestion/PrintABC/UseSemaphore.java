package cn.com.git.leon.E_Thread.i_threadQuestion.PrintABC;

import java.util.concurrent.Semaphore;

/**
 * @author sirius
 * @since 2019/5/8
 */
public class UseSemaphore implements Runnable{

    private Semaphore thisSemaphore;

    private Semaphore nextSemaphore;

    private String printStr;

    public UseSemaphore(Semaphore thisSemaphore, Semaphore nextSemaphore, String printStr) {
        this.thisSemaphore = thisSemaphore;
        this.nextSemaphore = nextSemaphore;
        this.printStr = printStr;
    }

    @Override
    public void run() {
        try {
            for(int i =0;i<10;i++) {
                thisSemaphore.acquire();
                System.out.print(printStr);
                nextSemaphore.release();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class UseSemaphoreTest{
    public static void main(String[] args) {
        Semaphore semaphoreA = new Semaphore(1);
        Semaphore semaphoreB = new Semaphore(0);
        Semaphore semaphoreC = new Semaphore(0);
        new Thread(new UseSemaphore(semaphoreA,semaphoreB,"A")).start();
        new Thread(new UseSemaphore(semaphoreB,semaphoreC,"B")).start();
        new Thread(new UseSemaphore(semaphoreC,semaphoreA,"C")).start();

    }
}