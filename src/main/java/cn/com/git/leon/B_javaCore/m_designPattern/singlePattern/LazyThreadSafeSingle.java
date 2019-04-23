package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class LazyThreadSafeSingle {

    private static LazyThreadSafeSingle lazyThreadSafeSingle;

    private LazyThreadSafeSingle(){}

    public static synchronized LazyThreadSafeSingle getInstance(){
        if (lazyThreadSafeSingle == null){
            lazyThreadSafeSingle = new LazyThreadSafeSingle();
        }
        return lazyThreadSafeSingle;
    }


}
