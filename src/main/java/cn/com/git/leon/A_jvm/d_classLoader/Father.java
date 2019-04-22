package cn.com.git.leon.A_jvm.d_classLoader;

/**
 * @author sirius
 * @since 2019/2/22
 */
public class Father {

    {
        System.out.println("父类普通代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }

    public Father() {
        System.out.println("父类构造方法");
    }
}
