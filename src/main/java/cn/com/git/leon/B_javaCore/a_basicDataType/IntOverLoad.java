package cn.com.git.leon.B_javaCore.a_basicDataType;

/**
 * 整形溢出
 * @author sirius
 * @since 2019/2/26
 */
public class IntOverLoad {

    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        //2^31 -1 0111........1111 +1      -2^31
        System.out.println(i);
        System.out.println(i+1);
        int j = Integer.MIN_VALUE;
        System.out.println(j);
        System.out.println(j-1);
    }
}
