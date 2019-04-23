package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.FactoryMethodDemo;


import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        IColor iColor = factoryMethod.getColor("red");
        iColor.get();
    }
}
