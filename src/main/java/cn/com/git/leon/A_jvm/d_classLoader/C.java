package cn.com.git.leon.A_jvm.d_classLoader;

/**
 * @author sirius
 * @since 2019/2/25
 */
public class C {

    static {
        System.out.println("C静态代码块");
    }

    public C() {
        System.out.println("C构造");
    }

    {
        System.out.println("C代码块");
    }

}
