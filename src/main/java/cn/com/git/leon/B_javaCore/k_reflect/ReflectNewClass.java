package cn.com.git.leon.B_javaCore.k_reflect;

/**
 * @author sirius
 * @since 2019/5/16
 */
public class ReflectNewClass {
    public static void main(String[] args) {
        try {
            //通过类名.class
            Class clazz = ReflectData.class;
            //通过实例命.getClass();
            ReflectData reflectData = new ReflectData();
            Class clazz2 = reflectData.getClass();
            //通过Class.forName
            Class clazz3 = Class.forName("cn.com.git.leon.B_javaCore.k_reflect.ReflectData");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
