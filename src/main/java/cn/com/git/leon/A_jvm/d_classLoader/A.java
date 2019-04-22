package cn.com.git.leon.A_jvm.d_classLoader;

/**
 * @author sirius
 * @since 2019/2/22
 */
public class A extends Father{



    static {
        System.out.println("A静态代码块");
    }

    {
        System.out.println("A代码块");
    }

    B b = new B();

    public static C c = new C();

    public A() {
        System.out.println("A构造");
    }

    public static class inner{
        static {
            System.out.println("内部类静态代码块");
        }
        {
            System.out.println("内部类代码块");
        }

        public inner() {
            System.out.println("内部类构造");
        }
    }

    public static void staticMethod(){
        System.out.println("静态方法");
    }
}
