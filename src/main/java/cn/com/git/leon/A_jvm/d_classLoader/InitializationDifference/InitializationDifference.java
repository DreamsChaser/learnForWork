package cn.com.git.leon.A_jvm.d_classLoader.InitializationDifference;

import cn.com.git.leon.A_jvm.d_classLoader.Father;

/**
 * ClassLoader.loadClass和Class.forName
 * @author sirius
 * @since 2019/4/22
 */
public class InitializationDifference {
    public static void main(String[] args) {
        try {
            ClassLoader.getSystemClassLoader().loadClass("cn.com.git.leon.A_jvm.d_classLoader.Father");
            System.out.println("-----------------------");
            Class.forName("cn.com.git.leon.A_jvm.d_classLoader.Father");
            System.out.println("------------------------");
            Father father = new Father();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
