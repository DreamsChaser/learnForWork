package cn.com.git.leon.A_Algorithm.Select;

import cn.com.git.leon.A_Algorithm.ArrayData;
import cn.com.git.leon.A_Algorithm.Sort.QuickSort;
import com.alibaba.fastjson.JSON;

/**
 * 二分法 适用于有序
 * @author sirius
 * @since 2019/5/10
 */
public class DichotomySearch {

    public static int search(int[] data,int value) {
        int left = 0;
        int right = data.length - 1;
        while(left <= right) {
            int middle = (left+right)/2;
            if (data[middle] == value) {
                return middle;
            }
            //二分查找右边
            if (data[middle] < value){
                left = middle + 1;
            }
            //二分查找左边
            if (data[middle] > value){
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        QuickSort.sort(ArrayData.DATA);
        System.out.println(JSON.toJSONString(ArrayData.DATA));
        System.out.println(DichotomySearch.search(ArrayData.DATA,100));
    }
}