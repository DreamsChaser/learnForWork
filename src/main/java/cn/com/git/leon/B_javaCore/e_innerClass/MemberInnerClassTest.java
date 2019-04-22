package cn.com.git.leon.B_javaCore.e_innerClass;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class MemberInnerClassTest {

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.MemberInner memberInner = memberInnerClass.new MemberInner();
    }
}
