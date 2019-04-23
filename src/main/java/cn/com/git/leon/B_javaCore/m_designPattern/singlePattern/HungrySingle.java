package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

import java.io.Serializable;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class HungrySingle implements Serializable{

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){
        return hungrySingle;
    }
}
