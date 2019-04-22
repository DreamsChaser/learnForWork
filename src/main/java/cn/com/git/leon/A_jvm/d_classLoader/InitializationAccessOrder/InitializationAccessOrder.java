package cn.com.git.leon.A_jvm.d_classLoader.InitializationAccessOrder;

import cn.com.git.leon.A_jvm.d_classLoader.A;

/**
 * 先父后子 先静后常 同一阶层按代码先后顺序
 * @author sirius
 * @since 2019/4/22
 */
public class InitializationAccessOrder {

    public static void main(String[] args) {
        A a = new A();
//        A.staticMethod();
//        A.inner inner = new A.inner();


    }
}
