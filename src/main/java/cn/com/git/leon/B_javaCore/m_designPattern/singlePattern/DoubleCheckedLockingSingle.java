package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class DoubleCheckedLockingSingle {

    private volatile DoubleCheckedLockingSingle doubleCheckedLockingSingle;

    private DoubleCheckedLockingSingle(){}

    public DoubleCheckedLockingSingle getInstance(){
        if (doubleCheckedLockingSingle == null){
            synchronized (this){
                if (doubleCheckedLockingSingle == null){
                    doubleCheckedLockingSingle = new DoubleCheckedLockingSingle();
                }
            }
        }
        return doubleCheckedLockingSingle;
    }

}
