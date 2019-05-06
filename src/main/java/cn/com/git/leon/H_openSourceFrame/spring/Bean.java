package cn.com.git.leon.H_openSourceFrame.spring;

import org.springframework.stereotype.Component;

/**
 * @author sirius
 * @since 2019/5/6
 */
@Component
public class Bean {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bean() {
        this.name = "张三";
        this.id = "1";
    }
}
