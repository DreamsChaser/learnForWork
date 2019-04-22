package cn.com.git.leon.A_jvm.d_classLoader;

/**
 * @author sirius
 * @since 2019/2/22
 */
public class B {

    static {
        System.out.println("B静态代码块");
    }

    public B() {
        System.out.println("B构造");
    }

    {
        System.out.println("B代码块");
    }
}
