package cn.com.git.leon.A_Algorithm.Bitmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 用户标签统计
 * 每个标签作为一个bitmap 可以通过&和|操作求并集交集
 * @author sirius
 * @since 2019/5/4
 */
public class UserTagCount {
    public static void main(String[] args) {
        //1+4+8+16+32   1男 2女 4程序员 8脱发 16没钱 32单身
        int val1 = 51;
        //1 4 32
        int val2 = 37;
        //2 16 32
        int val3 = 50;
        //2 4
        int val4 = 6;
        //1
        int val5 = 1;
        List<Integer> records = new ArrayList<>();
        records.add(val1);
        records.add(val2);
        records.add(val3);
        records.add(val4);
        records.add(val5);
        System.out.println("所有男生");
        records.stream().filter(i->(i&TagEnum.MAN.getValue()) == TagEnum.MAN.getValue()).forEach(i-> System.out.print(i+","));
        System.out.println("\n单身男生");
        records.stream().filter(i->(i&(TagEnum.MAN.getValue()+TagEnum.ALONE.getValue())) == (TagEnum.MAN.getValue()+TagEnum.ALONE.getValue())).forEach(i-> System.out.print(i+","));
        System.out.println("\n单身或者没钱的");
        records.stream().filter(i->(i&(TagEnum.ALONE.getValue()+TagEnum.NOMONEY.getValue()))>0).forEach(i-> System.out.print(i+","));
    }
}
