package cn.com.git.leon.B_javaCore.l_proxy.dynamicProxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 被代理对象
     */
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        //设置父类对象
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallbackType(this.getClass());
        //回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        //设置父类对象
        enhancer.setSuperclass(clazz);
        //回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用前");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("调用后");
        return result;
    }
}
