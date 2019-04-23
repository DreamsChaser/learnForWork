package cn.com.git.leon.B_javaCore.k_reflect;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class ReflectData extends ReflectDataFather{

    private String privateField;

    public String publicField;

    String defaultField;

    protected String protectedField;

    public void publicMethod(){
        System.out.println("方法");
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    public String getPublicField() {
        return publicField;
    }

    public void setPublicField(String publicField) {
        this.publicField = publicField;
    }

    public String getDefaultField() {
        return defaultField;
    }

    public void setDefaultField(String defaultField) {
        this.defaultField = defaultField;
    }

    public String getProtectedField() {
        return protectedField;
    }

    public void setProtectedField(String protectedField) {
        this.protectedField = protectedField;
    }
}
