package cn.com.git.leon.B_javaCore.b_keyword.D_string;

/**
 * @author sirius
 * @since 2019/5/15
 */
public class StringDemoAnalysis {
    public static void main(String[] args) {
        /**
         * 堆中创建对象aaa 并在字符串常量池中创建字面量aaa s1指向堆中对象 s2指向常量池中字面量
         * false
         */
        String s1 = new String("aaa");
        String s2 = "aaa";
        System.out.println(s1 == s2);
        /**
         * 堆中创建对象bbb 并在字符串常量池中创建字面量bbb
         * intern判断字符串常量池中是否有bbb 有返回字符串常量池中的地址即s1
         * s2 = "bbb"先去常量池中判断是否存在 存在则直接返回
         * true
         */
        s1 = new String("bbb").intern();
        s2 = "bbb";
        System.out.println(s1 == s2);
        /**
         * s1 ="ccc"先判断字符串常量池中是否存在 不存在则在字符串常量池中创建ccc
         * true
         */
        s1 = "ccc";
        s2 = "ccc";
        System.out.println(s1 == s2);
        /**
         * 先在堆中创建对象ddd 常量池中创建字面量ddd 调用intern返回常量池中自字面量地址
         * true
         */
        s1 = new String("ddd").intern();
        s2 = new String("ddd").intern();
        System.out.println(s1 == s2);
        /**
         * 在字符串常量池创建abcd
         * true
         */
        s1 = "ab" + "cd";
        s2 = "abcd";
        System.out.println(s1 == s2);
        /**
         * 在字符串常量池中创建hh 在堆中创建ahh s1相当于StringBuilder.append();指向堆中对象
         *  s2= "ahh";字符串常量池没有，创建ahh并返回改地址及常量池中的字面量地址
         * false
         */
        String temp = "hh";
        s1 = "a" + temp;
        s2 = "ahh";
        System.out.println(s1 == s2);
        /**
         * 在常量池中创建hh 在堆中创建ahh对象
         * 调用intern（1.7）判断字符串常量池无ahh 将堆中ahh引用存入常量池返回改引用指向堆中对象
         * s2 = "ahh" 判断常量池有ahh即堆中引用
         * true
         */
        temp = "hh";
        s1 = "a" + temp;
        s1.intern();
        s2 = "ahh";
        System.out.println(s1 == s2);
        /**
         * 字符串常量池创建hh 调用intern返回常量池字面量hh地址
         * 字符串常量池创建a 堆中创建ahh s1指向堆中对象
         * 字符串常量池创建ahh s2指向常量池
         * false
         */
        temp = "hh".intern();
        s1 = "a" + temp;
        s2 = "ahh";
        System.out.println(s1 == s2);
        /**
         * 常量池创建hh 调用intern 返回常量池hh地址
         * 常量池创建a 堆中创建ahh 调用intern 在常量池创建堆中ahh的引用 并返回
         * s2取常量池ahh 即堆中引用
         * true
         */
        temp = "hh".intern();
        s1 = ("a" + temp).intern();
        s2 = "ahh";
        System.out.println(s1 == s2);
        /**
         * 堆中创建1 常量池创建1 s1指向堆中地址
         * intern返回常量池1地址
         * s2指向常量池1地址
         * false
         */
        s1 = new String("1");
        s1.intern();
        s2 = "1";
        System.out.println(s1 == s2);
        /**
         * 常量池创建1 堆中创建1和1 和11
         * 调用intern判断常量池无11 则吧堆中11的地址存入常量池
         * s4得到常量池的引用及堆中11地址
         * true(1.7以前false)
         */
        String s3 = new String("1") + new String("1");    // 此时生成了四个对象 常量池中的"1" + 2个堆中的"1" + s3指向的堆中的对象（注此时常量池不会生成"11"）
        s3.intern();    // jdk1.7之后，常量池不仅仅可以存储对象，还可以存储对象的引用，会直接将s3的地址存储在常量池
        String s4 = "11";    // jdk1.7之后，常量池中的地址其实就是s3的地址
        System.out.println(s3 == s4);
        /**
         * 常量池创建2 堆中创建2 和2 和22
         * s4 = "22"判断常量池无22 则新建22字面量返回常量池字面量地址
         * 调用intern 此时常量池有值
         * false
         */
        s3 = new String("2") + new String("2");
        s4 = "22";        // 常量池中不存在22，所以会新开辟一个存储22对象的常量池地址
        s3.intern();    // 常量池22的地址和s3的地址不同
        System.out.println(s3 == s4);
    }
}
