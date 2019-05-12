package cn.com.git.leon.A_Algorithm.Sort;

import cn.com.git.leon.A_Algorithm.ArrayData;
import com.alibaba.fastjson.JSON;

/**
 * 选择排序
 * 每次都遍历把最小(大)数放在第一个
 * @author sirius
 * @since 2019/5/12
 */
public class SelectSort {

    public static void sort(int[] data){
        for (int i = 0;i<data.length;i++){
            int min = data[i];
            int minIndex = i;
            for (int j = i+1;j<data.length;j++){
                //找到最小值
                if (data[j] < min){
                    min = data[j];
                    minIndex = j;
                }
            }
            //将最小值和第一个交换
            if (i != minIndex){
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectSort.sort(ArrayData.DATA);
        System.out.println(JSON.toJSONString(ArrayData.DATA));
        System.out.println(JSON.toJSONString(ArrayData.DATA).equals(JSON.toJSONString(ArrayData.CORRECT_DATA)));

    }
}
