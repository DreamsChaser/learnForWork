package cn.com.git.leon.B_javaCore.b_keyword.A_final;

/**
 * @author sirius
 * @since 2019/5/24
 */
public class FinalTest {

    private final String STR = "final";

    private static final String STR2 = "static final";

    private String str;

    public void test(){
        System.out.println(STR+str+STR2);
    }
}
