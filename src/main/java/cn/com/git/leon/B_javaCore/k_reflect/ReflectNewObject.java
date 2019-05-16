package cn.com.git.leon.B_javaCore.k_reflect;

/**
 * @author sirius
 * @since 2019/5/16
 */
public class ReflectNewObject {
    public static void main(String[] args) {
        try {
            ReflectData reflectData = ReflectData.class.newInstance();
            ReflectData reflectData1 = ReflectData.class.getConstructor().newInstance();
            ReflectData reflectData2 = ReflectData.class.getConstructor(String.class).newInstance("public");
            ReflectData reflectData3 = ReflectData.class.getConstructor(String.class,String.class).newInstance("public","default");
            System.out.println("---------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
