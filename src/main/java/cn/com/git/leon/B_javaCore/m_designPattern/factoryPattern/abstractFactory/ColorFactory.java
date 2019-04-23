package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.abstractFactory;


import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.IBound;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.Black;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.IColor;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.Red;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.White;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class ColorFactory implements IFactory{
    @Override
    public IBound getBound(String bound) {
        return null;
    }

    @Override
    public IColor getColor(String color) {
        IColor iColor = null;
        if ("red".equals(color)){
            iColor = new Red();
        }else if ("white".equals(color)){
            iColor = new White();
        }else if ("black".equals(color)){
            iColor = new Black();
        }
        return iColor;
    }
}
