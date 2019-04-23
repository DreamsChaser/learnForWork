package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.abstractFactory;


import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.IBound;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory colorFactory = FactoryProducer.getFactory("COLOR");
        IFactory boundFactory = FactoryProducer.getFactory("BOUND");

        IColor iColor = colorFactory.getColor("white");
        IBound iBound = boundFactory.getBound("benz");
        iColor.get();
        iBound.get();
    }
}
