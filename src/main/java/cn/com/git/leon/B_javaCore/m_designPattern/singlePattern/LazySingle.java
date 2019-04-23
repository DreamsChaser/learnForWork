package cn.com.git.leon.B_javaCore.m_designPattern.singlePattern;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class LazySingle {

    private static LazySingle lazySingle;

    private LazySingle(){}

    public static LazySingle getInstance(){
        if (lazySingle == null){
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
