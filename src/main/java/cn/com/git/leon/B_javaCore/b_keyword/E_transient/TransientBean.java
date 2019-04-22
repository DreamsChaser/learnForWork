package cn.com.git.leon.B_javaCore.b_keyword.E_transient;

import java.io.Serializable;

/**
 * @author sirius
 * @since 2019/4/22
 */
public class TransientBean implements Serializable{

    private String name;

    private transient String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
