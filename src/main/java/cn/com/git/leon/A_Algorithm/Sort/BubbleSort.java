package cn.com.git.leon.A_Algorithm.Sort;

import cn.com.git.leon.A_Algorithm.ArrayData;
import com.alibaba.fastjson.JSON;

/**
 * 冒泡排序
 * 多次两两比较
 * @author sirius
 * @since 2019/5/10
 */
public class BubbleSort {

    public static void sort(int[] data){
        for (int i = 0;i<data.length-1;i++){
            for (int j = 0;j<data.length-1;j++) {
                if (data[j]>data[j+1]){
                    //交换位置
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    /**
     * 如果其中一次排序没有数据变化 则不需要进行遍历
     * @param data
     */
    public static void optimizeSort1(int[] data){
        for (int i = 0;i<data.length-1;i++){
            boolean flag = true;
            for (int j = 0;j<data.length-1;j++) {
                if (data[j]>data[j+1]){
                    //交换位置
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort.optimizeSort1(ArrayData.DATA);
        System.out.println(JSON.toJSONString(ArrayData.DATA));
        System.out.println(JSON.toJSONString(ArrayData.DATA).equals(JSON.toJSONString(ArrayData.CORRECT_DATA)));
    }
}
