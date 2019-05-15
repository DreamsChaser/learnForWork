package cn.com.git.leon.D_collection.f_treeMap;

import com.alibaba.fastjson.JSON;

import java.util.TreeMap;

/**
 * @author sirius
 * @since 2019/5/15
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1,"你");
        treeMap.put(3,"好");
        treeMap.put(2,"吗");
        System.out.println(JSON.toJSONString(treeMap));
    }
}
