package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.abstractFactory;


import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.Audi;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.Benz;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.Bmw;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.IBound;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class BoundFactory implements IFactory{
    @Override
    public IBound getBound(String bound) {
        IBound iBound = null;
        if ("benz".equals(bound)){
            iBound = new Benz();
        }else if ("bmw".equals(bound)){
            iBound = new Bmw();
        }else if ("audi".equals(bound)){
            iBound = new Audi();
        }
        return iBound;
    }

    @Override
    public IColor getColor(String color) {
        return null;
    }
}
