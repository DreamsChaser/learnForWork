package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

/**
 * @author sirius
 * @since 2019/4/12
 */
public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }

}
