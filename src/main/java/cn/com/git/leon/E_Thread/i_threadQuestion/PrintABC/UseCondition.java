package cn.com.git.leon.E_Thread.i_threadQuestion.PrintABC;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/5/8
 */
public class UseCondition implements Runnable{

    private ReentrantLock lock;

    private Condition thisCondition;

    private Condition nextCondition;

    private String printStr;

    private final int COUNT = 4;

    public UseCondition(ReentrantLock lock, Condition thisCondition, Condition nextCondition, String printStr) {
        this.lock = lock;
        this.thisCondition = thisCondition;
        this.nextCondition = nextCondition;
        this.printStr = printStr;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            //打印字符
            for(int i =0;i<COUNT;i++) {
                System.out.print(printStr);
                //唤醒下一步线程
                nextCondition.signal();
                //如果不是最后一次则阻塞当前线程
                if (i != COUNT-1){
                    thisCondition.await();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

class UseConditionTest{
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();
        Condition conditionC = lock.newCondition();
        new Thread(new UseCondition(lock,conditionA,conditionB,"A")).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(new UseCondition(lock,conditionB,conditionC,"B")).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(new UseCondition(lock,conditionC,conditionA,"C")).start();
    }
}