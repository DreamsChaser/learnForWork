package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class Bmw implements IBound{
    @Override
    public void get() {
        System.out.println("宝马");
    }
}
