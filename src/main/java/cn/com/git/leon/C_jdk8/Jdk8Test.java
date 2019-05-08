package cn.com.git.leon.C_jdk8;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author sirius
 * @since 2019/5/8
 */
public class Jdk8Test {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1,3,5,19,78,56,43,0,14,33,33};
        List<Integer> list = Arrays.asList(intArr);
        //list.stream().forEach(i-> System.out.println(i));
        list.stream().forEach(System.out::print);
        System.out.println("----");
        list.stream().filter(i->i>30).forEach(System.out::print);
        System.out.println("----");
        list.stream().distinct().forEach(System.out::print);
        System.out.println("----");
        list.stream().map(i->i+1).forEach(System.out::print);
        System.out.println("----");

        UserBean userBean1 = new UserBean("1","张三",11);
        UserBean userBean2 = new UserBean("2","李四",10);
        UserBean userBean3 = new UserBean("3","王五",9);
        List<UserBean> userBeanList = new ArrayList<>();
        userBeanList.add(userBean1);
        userBeanList.add(userBean2);
        userBeanList.add(userBean3);
        List<String> nameList = userBeanList.stream().map(userBean -> userBean.getName()).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(nameList));
    }
}
