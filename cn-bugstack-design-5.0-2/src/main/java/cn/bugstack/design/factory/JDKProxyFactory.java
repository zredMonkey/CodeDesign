package cn.bugstack.design.factory;

import cn.bugstack.design.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理抽象工厂
 */

public class JDKProxyFactory {

    /**
     *
     * @param cacheClazz
     * @param cacheAdapter 用于决定实例化哪套集群服务使用Redis功能
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T getProxy(Class<T> cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClazz}, handler);
    }

}
