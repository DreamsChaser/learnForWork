package cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.abstractFactory;


import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.Bound.IBound;
import cn.com.git.leon.B_javaCore.m_designPattern.factoryPattern.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public interface IFactory {

    IBound getBound(String bound);

    IColor getColor(String color);
}
