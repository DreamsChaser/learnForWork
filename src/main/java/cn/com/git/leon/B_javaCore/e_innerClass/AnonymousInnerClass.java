package cn.com.git.leon.B_javaCore.e_innerClass;

/**
 * 匿名内部类
 * @author sirius
 * @since 2019/3/11
 */
public class AnonymousInnerClass {

    public void show(){
        new IProduct() {
            @Override
            public void show() {
                System.out.println("AnonymousInnerClass");
            }
        }.show();
    }
}
