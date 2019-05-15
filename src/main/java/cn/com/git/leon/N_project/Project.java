package cn.com.git.leon.N_project;

/**
 * @author sirius
 * @since 2019/5/14
 */
public class Project {
    public static void main(String[] args) {
        //第二种情况
        String temp = "hh";
        String s1 = "a" + temp;
        String s2 = "ahh";
        String s3 = "hh";
        System.out.println(s1 == s2);
        System.out.println(temp == s3);
    }
}
