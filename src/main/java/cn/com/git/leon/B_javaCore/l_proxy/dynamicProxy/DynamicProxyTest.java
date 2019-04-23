package cn.com.git.leon.B_javaCore.l_proxy.dynamicProxy;

import cn.com.git.leon.B_javaCore.l_proxy.IProxyService;
import cn.com.git.leon.B_javaCore.l_proxy.IProxyServiceImpl;
import cn.com.git.leon.B_javaCore.l_proxy.dynamicProxy.cglibProxy.CglibProxy;
import cn.com.git.leon.B_javaCore.l_proxy.dynamicProxy.jdkProxy.JdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        IProxyService iProxyService = new IProxyServiceImpl();

        /**
         * jdk代理接口
         */
        JdkProxy jdkProxy = new JdkProxy(iProxyService);
        IProxyService iProxyService1 = (IProxyService) Proxy.newProxyInstance(iProxyService.getClass().getClassLoader(),iProxyService.getClass().getInterfaces(),jdkProxy);
        iProxyService1.doService();

        /**
         * cglib代理接口
         */
        CglibProxy cglibProxy = new CglibProxy();
        IProxyService iProxyService2 = (IProxyService) cglibProxy.getInstance(iProxyService.getClass());
        iProxyService2.doService();

        /**
         * cglib代理类
         */
        IProxyServiceImpl iProxyServiceImpl = (IProxyServiceImpl) cglibProxy.getInstance(IProxyServiceImpl.class);
        iProxyServiceImpl.doService();
    }
}
