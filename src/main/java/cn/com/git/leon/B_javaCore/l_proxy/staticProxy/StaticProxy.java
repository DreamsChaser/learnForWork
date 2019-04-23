package cn.com.git.leon.B_javaCore.l_proxy.staticProxy;

import cn.com.git.leon.B_javaCore.l_proxy.IProxyService;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class StaticProxy implements IProxyService{

    private IProxyService iProxyService;

    public StaticProxy(IProxyService iProxyService){
        this.iProxyService = iProxyService;
    }

    @Override
    public void doService() {
        System.out.println("开始调用接口");
        iProxyService.doService();
        System.out.println("接口调用完成");
    }
}
