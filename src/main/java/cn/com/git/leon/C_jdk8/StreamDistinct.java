package cn.com.git.leon.C_jdk8;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author sirius
 * @since 2019/5/9
 */
public class StreamDistinct {

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        //putIfAbsent()方法是如果key不存在则put如map中，并返回null。若key存在，则直接返回key所对应的value值
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void main(String[] args) {
        UserBean userBean1 = new UserBean("1","张三",10);
        UserBean userBean2 = new UserBean("2","李四",10);
        UserBean userBean3 = new UserBean("3","李四",9);
        UserBean userBean4 = new UserBean("3","王五",10);
        List<UserBean> userBeanList = new ArrayList<>();
        userBeanList.add(userBean1);
        userBeanList.add(userBean2);
        userBeanList.add(userBean3);
        userBeanList.add(userBean4);
        userBeanList.add(userBean4);
        List<UserBean> userBeans = userBeanList.stream().filter(distinctByKey(userBean ->userBean.getAge())).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(userBeans));
        List<UserBean> result = userBeanList.stream().distinct().collect(Collectors.toList());
        System.out.println(JSON.toJSONString(result));
        System.out.println(userBean3.equals(userBean4));

    }
}
