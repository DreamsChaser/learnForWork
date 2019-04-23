package cn.com.git.leon.B_javaCore.l_proxy.staticProxy;

import cn.com.git.leon.B_javaCore.l_proxy.IProxyServiceImpl;

/**
 * @author sirius
 * @since 2019/4/23
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new IProxyServiceImpl());
        staticProxy.doService();
    }
}
