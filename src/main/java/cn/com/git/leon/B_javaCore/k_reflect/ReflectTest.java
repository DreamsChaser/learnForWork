package cn.com.git.leon.B_javaCore.k_reflect;

import java.lang.reflect.Field;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class ReflectTest {
    public static void main(String[] args) {
//        Field[] declaredFields = ReflectData.class.getDeclaredFields();
//        Field[] fields = ReflectData.class.getFields();
        ReflectData reflectData = new ReflectData();
        try {
            Field field = reflectData.getClass().getDeclaredField("privateField");
            field.setAccessible(true);
            field.set(reflectData,"private");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(reflectData.getPrivateField());
    }
}
