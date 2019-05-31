package cn.com.git.leon.B_javaCore.r_valuePassing;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * 值传递和引用传递
 * @author sirius
 * @since 2019/5/31
 */
public class ValuePassingReferencePassing {
//    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("1");
//        list1.add("2");
//        List<String> list2 = new ArrayList<>();
//        list2.add("a");
//        list2.add("b");
//        list1 = list2;
//        System.out.println(JSON.toJSONString(list1));
//        list2.add("3");
//        System.out.println(JSON.toJSONString(list1));
//
//    }

    public static void test(List list){
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list = list2;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        System.out.println(JSON.toJSONString(list1));
        test(list1);
        System.out.println(JSON.toJSONString(list1));
    }
}
