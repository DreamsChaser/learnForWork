package cn.com.git.leon.B_javaCore.m_designPattern.strategyPattern;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class BStrategy implements IStrategy{
    @Override
    public void doService() {
        System.out.println("执行B分支");
    }
}
