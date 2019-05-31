package cn.com.git.leon.B_javaCore.r_valuePassing;

import cn.com.git.leon.B_javaCore.i_clone.shallowClone.Person;

/**
 * @author sirius
 * @since 2019/5/31
 */
public class Test2 {
//    public static void main(String[] args) {
//        Person p = new Person("张三");
//        Person person = new Person("李四");
//        p = person;
//        System.out.println(p);
//    }

    public static void main(String[] args) {
        Person p = new Person("张三");
        change(p);
        System.out.println(p.getName());
    }

    public static void change(Person p) {
        p.setName("李四");
    }
}
