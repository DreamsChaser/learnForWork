package cn.com.git.leon.B_javaCore.b_keyword.B_static;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class StaticBean {

    private static String id;

    private String name;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        StaticBean.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
