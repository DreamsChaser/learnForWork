package cn.com.git.leon.B_javaCore.b_keyword.D_string;

/**
 * @author sirius
 * @since 2019/2/27
 */
public class StringDemo {

    public static void main(String[] args) {
        /**
         * String和new String
         */
        String str1 = new String("a");
        String str2 = "a";
        System.out.println(str1 == str2);
        /**
         * String和new String+new String
         */
        String str3 = new String("c") + new String("d");
        String str4 = "cd";
        String str5 = "c" + "d";
        String str6 = "c" + new String("d");
        System.out.println(str3 == str4);
        System.out.println(str4 == str5);
        System.out.println(str5 == str6);
        System.out.println("-----------------------");
        String str7 = "e";
        String str8 = "f";
        String str9 = "ef";
        String str10 = str7 + str8;
        System.out.println(str9 == str10);
        System.out.println(str9 == "e"+"f");
    }

}
