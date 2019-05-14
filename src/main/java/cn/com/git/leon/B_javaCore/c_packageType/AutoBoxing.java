package cn.com.git.leon.B_javaCore.c_packageType;

/**
 * @author sirius
 * @since 2019/2/28
 */
public class AutoBoxing {

    public static void main(String[] args) {
        /**
         * ==的缓存
         */
        Integer i = 1;
        Integer j = 1;
        int k = 1;
        Integer m = 128;
        Integer n = 128;
        int o = 128;
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println(m == n);
        System.out.println(m == o);
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2);
        System.out.println("--------------------");
        Integer c = 130;
        Integer d = 20;
        Integer e = 150;
        System.out.println(e==(c+d));
    }
}
