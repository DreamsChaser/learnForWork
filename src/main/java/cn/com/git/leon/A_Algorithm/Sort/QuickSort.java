package cn.com.git.leon.A_Algorithm.Sort;

import cn.com.git.leon.A_Algorithm.ArrayData;
import com.alibaba.fastjson.JSON;

/**
 * 快速排序 挖坑填数法
 * @author sirius
 * @since 2019/5/12
 */
public class QuickSort {

    public static void sort(int[] data){
        sort(data,0,data.length-1);
    }

    public static void sort(int[] data,int left,int right){
        if (left < right){
            int i = left;
            int j = right;
            int temp = data[i];
            //取出左边数据
            while (i<j){
                //从右开始找一个比它小的数
                while (data[j] > temp && i < j){
                    j--;
                }
                if (i<j){
                    data[i++] = data[j];
                }
                //从左边找一个比它大的数
                while (data[i] < temp && i<j){
                    i++;
                }
                if (i<j){
                    data[j--] = data[i];
                }
            }
            //放入中间值
            data[i] = temp;
            //递归剩下两个区
            sort(data,0,i-1);
            sort(data,i+1,right);
        }
    }

    public static void main(String[] args) {
        QuickSort.sort(ArrayData.DATA);
        System.out.println(JSON.toJSONString(ArrayData.DATA));
        System.out.println(JSON.toJSONString(ArrayData.DATA).equals(JSON.toJSONString(ArrayData.CORRECT_DATA)));

    }
}
