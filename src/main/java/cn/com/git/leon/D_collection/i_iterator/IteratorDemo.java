package cn.com.git.leon.D_collection.i_iterator;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sirius
 * @since 2019/4/24
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int result = iterator.next();
            if (result == 1){
                //list.remove(1);
                iterator.remove();
            }
        }
        System.out.println(JSON.toJSONString(list));

    }
}
