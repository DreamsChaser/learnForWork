package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class StaticInnerSingle {

    private static class InnerSingle{
        private static final StaticInnerSingle INSTANCE = new StaticInnerSingle();
    }

    private StaticInnerSingle(){}

    public static final StaticInnerSingle getInstance(){
        return InnerSingle.INSTANCE;
    }
}
