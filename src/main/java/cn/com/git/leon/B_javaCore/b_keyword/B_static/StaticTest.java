package cn.com.git.leon.B_javaCore.b_keyword.B_static;

/**
 * @author sirius
 * @since 2019/3/7
 */
public class StaticTest {

    public static void main(String[] args) {
        StaticBean staticBean1 = new StaticBean();
        staticBean1.setId("1");
        staticBean1.setName("name1");
        StaticBean staticBean2 = new StaticBean();
        System.out.println(staticBean2.getId()+"\n"+staticBean2.getName());
    }
}
