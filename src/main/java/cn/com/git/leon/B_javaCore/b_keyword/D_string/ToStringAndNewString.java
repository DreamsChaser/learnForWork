package cn.com.git.leon.B_javaCore.b_keyword.D_string;

/**
 * @author sirius
 * @since 2019/5/15
 */
public class ToStringAndNewString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String str1 = stringBuilder.append("a").append("b").toString();
        str1.intern();
        String str2 = "ab";
        System.out.println(str1 == str2);
    }
}
