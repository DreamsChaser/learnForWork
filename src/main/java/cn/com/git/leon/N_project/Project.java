package cn.com.git.leon.N_project;

/**
 * @author sirius
 * @since 2019/5/14
 */
public class Project {
    public static void main(String[] args) {
        //第二种情况
        String s3 = new String("1") + new String("1");
        String s5 = s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
}
