package cn.com.git.leon.B_javaCore.b_keyword.E_transient;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class TransientBeanTest {

    private static final String URL = "D:\\workspace\\learnForWork\\src\\main\\java\\cn\\com\\git\\leon\\B_javaCore\\b_keyword\\E_transient";

    public static void main(String[] args) {
        TransientBean transientBean = new TransientBean();
        transientBean.setName("小明");
        transientBean.setPassword("xiaoming");
        File file = new File(URL+"\\transientTest");
        if (file.exists()){
            file.delete();
        }
        try {
            //序列化
            System.out.println(transientBean.getName()+transientBean.getPassword());
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(transientBean);
            out.close();
            //反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            TransientBean transientBean2 = (TransientBean) in.readObject();
            in.close();
            System.out.println(transientBean2.getName()+transientBean2.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            file.delete();
        }
    }
}
