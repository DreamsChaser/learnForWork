package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

import java.lang.reflect.Constructor;

/**
 * 反射攻击和序列化反序列化
 * @author sirius
 * @since 2019/4/14
 */
public class SingleReflectAttack {

    public static void main(String[] args) throws Exception {
        HungrySingle hungrySingle1 = HungrySingle.getInstance();
        HungrySingle hungrySingle2 = HungrySingle.getInstance();
        System.out.println(hungrySingle1 == hungrySingle2);
        Constructor<HungrySingle> constructor = HungrySingle.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingle hungrySingle3 = constructor.newInstance();
        System.out.println(hungrySingle1 == hungrySingle3);
    }

}
