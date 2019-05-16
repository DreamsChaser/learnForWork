package cn.com.git.leon.B_javaCore.d_serializable;

import java.io.*;

/**
 * @author sirius
 * @since 2019/5/16
 */
public class SerializableBeanDemo{
    public static void main(String[] args) {
        SerializableBean serializableBean = new SerializableBean();
        File file = new File("D:\\aaa.txt");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(serializableBean);
            serializableBean.id = "14";
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            serializableBean = (SerializableBean) objectInputStream.readObject();
            System.out.println(serializableBean.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
