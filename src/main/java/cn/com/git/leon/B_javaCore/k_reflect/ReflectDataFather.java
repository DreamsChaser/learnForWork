package cn.com.git.leon.B_javaCore.k_reflect;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class ReflectDataFather {

    private String privateFatherField;

    public String publicFatherField;

    public String getPrivateFatherField() {
        return privateFatherField;
    }

    public void setPrivateFatherField(String privateFatherField) {
        this.privateFatherField = privateFatherField;
    }

    public String getPublicFatherField() {
        return publicFatherField;
    }

    public void setPublicFatherField(String publicFatherField) {
        this.publicFatherField = publicFatherField;
    }
}
