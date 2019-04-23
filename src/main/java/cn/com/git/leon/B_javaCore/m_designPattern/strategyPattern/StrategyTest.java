package cn.com.git.leon.B_javaCore.m_designPattern.strategyPattern;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class StrategyTest {

    public static void main(String[] args) {
        new Context(new AStrategy()).useStrategy();
        new Context(new BStrategy()).useStrategy();

    }
}
