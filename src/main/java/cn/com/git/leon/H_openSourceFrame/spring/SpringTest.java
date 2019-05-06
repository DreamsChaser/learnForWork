package cn.com.git.leon.H_openSourceFrame.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sirius
 * @since 2019/5/6
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("读取xml文件");
        SpringUtil springUtil = (SpringUtil) applicationContext.getBean("springUtil");
        springUtil.show();
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
    }
}
