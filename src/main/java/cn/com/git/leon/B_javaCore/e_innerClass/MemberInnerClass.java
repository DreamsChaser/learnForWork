package cn.com.git.leon.B_javaCore.e_innerClass;

/**
 * @author sirius
 * @since 2019/3/8
 */
public class MemberInnerClass {

    private String privateStr;

    public String publicStr;

    public class MemberInner{

        private String privateStr;

        public String publicStr2;

        public void innerMethod(){
            System.out.println(privateStr + publicStr);
        }

//        public static void staticMethod(){
//
//        }
    }

    /**
     * 私有成员内部类无法访问
     */
    private class PrivateMemberInner{
        final String name = "PrivateMemberInner";
    }

    public void outMethod() {
//        System.out.println(publicStr2);
        PrivateMemberInner privateMemberInner = new PrivateMemberInner();
        System.out.println(privateMemberInner.name);
    }
}
