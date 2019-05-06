package cn.com.git.leon.H_openSourceFrame.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author sirius
 * @since 2019/5/6
 */
@Component("springUtil")
public class SpringUtil {

    @Autowired
    Bean bean;

    static Bean bean0;

    @PostConstruct
    private void init(){
        bean0 = this.bean;
    }

    public static void show(){
        System.out.println(bean0.getName());
    }
}
