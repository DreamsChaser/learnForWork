package cn.com.git.leon.A_jvm.b_gc;


/**
 * @author sirius
 * @since 2019/5/16
 */
public class StackOverflowErrorDemo {

    public static int add(int i){
        return add(1);
    }

    public static void main(String[] args) {
        System.out.println(StackOverflowErrorDemo.add(1));
    }

}
