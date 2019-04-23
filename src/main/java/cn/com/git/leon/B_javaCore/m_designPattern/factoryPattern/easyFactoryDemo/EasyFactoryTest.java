package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.easyFactoryDemo;


import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class EasyFactoryTest {
    public static void main(String[] args) {
        IColor iColor = EasyFactory.getColor("red");
        iColor.get();
    }
}
