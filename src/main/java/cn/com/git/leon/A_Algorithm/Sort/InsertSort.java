package cn.com.git.leon.A_Algorithm.Sort;

import cn.com.git.leon.A_Algorithm.ArrayData;
import com.alibaba.fastjson.JSON;

/**
 * 直接插入排序
 * 将最后一个数和已好顺序的数循环比较
 * @author sirius
 * @since 2019/5/10
 */
public class InsertSort {

    public static void sort(int[] data){
        int length = data.length;
        //从第二个数开始插入,循环和有序序列做比较
        for (int i = 1;i<length;i++){
            for (int j = 0;j<i;j++){
                if (data[i] <data[j]){
                    //交换
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertSort.sort(ArrayData.DATA);
        System.out.println(JSON.toJSONString(ArrayData.DATA));
        System.out.println(JSON.toJSONString(ArrayData.DATA).equals(JSON.toJSONString(ArrayData.CORRECT_DATA)));

    }
}