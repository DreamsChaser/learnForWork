package cn.com.git.leon.B_javaCore.e_innerClass;

/**
 * @author sirius
 * @since 2019/3/11
 */
public class LocalInnerClass {

    String str1 = "1";

    final String str3 = "2";

    public void outMethod(){
        String str = "e";
        final String str2 = "a";
        class LocalInner{
            public void test(){
                System.out.println(str1 + str2);
            }
        }
        new LocalInner().test();

    }

}
