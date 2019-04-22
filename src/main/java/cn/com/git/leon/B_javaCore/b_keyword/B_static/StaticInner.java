package cn.com.git.leon.B_javaCore.b_keyword.B_static;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class StaticInner {

    private static String str1;

    private String str3;

    static final String STR4 = "str4";

    final String STR5 = "str5";

    public static class inner{

        public static void test2(){
            System.out.println(str1+STR4);
        }
    }
}
