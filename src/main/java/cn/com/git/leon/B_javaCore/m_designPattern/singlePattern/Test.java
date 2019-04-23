package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class Test {
    public static void main(String[] args) {
        LazySingle lazySingle1 = LazySingle.getInstance();
        LazySingle lazySingle2 = LazySingle.getInstance();
        System.out.println(lazySingle1);
        System.out.println(lazySingle2);
        StaticInnerSingle staticInnerSingle1 = StaticInnerSingle.getInstance();
        StaticInnerSingle staticInnerSingle2 = StaticInnerSingle.getInstance();
        System.out.println(staticInnerSingle1 == staticInnerSingle2);
    }
}
