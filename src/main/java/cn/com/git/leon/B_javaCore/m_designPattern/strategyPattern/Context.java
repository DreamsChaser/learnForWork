package cn.com.git.leon.B_javaCore.m_designPattern.strategyPattern;

/**
 * 持有策略的类
 * @author sirius
 * @since 2019/4/14
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void useStrategy(){
        iStrategy.doService();
    }

}
