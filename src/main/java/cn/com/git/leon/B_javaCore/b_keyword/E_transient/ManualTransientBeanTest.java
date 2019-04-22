package cn.com.git.leon.B_javaCore.b_keyword.E_transient;

import java.io.*;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class ManualTransientBeanTest {

    private static final String URL = "D:\\workspace\\learnForWork\\src\\main\\java\\cn\\com\\git\\leon\\B_javaCore\\b_keyword\\E_transient";

    public static void main(String[] args) {
        ManualTransientBean transientBean = new ManualTransientBean();
        transientBean.setPassword("xiaohong");
        transientBean.setName("小红");
        File file = new File(URL+"\\transientTest");
        if (file.exists()){
            file.delete();
        }
        try {
            //序列化
            System.out.println(transientBean.getName()+transientBean.getPassword());
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(transientBean);
            //反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            ManualTransientBean transientBean2 = (ManualTransientBean) in.readObject();
            System.out.println(transientBean2.getName()+transientBean2.getPassword());

            out.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            file.delete();
        }
    }
}
