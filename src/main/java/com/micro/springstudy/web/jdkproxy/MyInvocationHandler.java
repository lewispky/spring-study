package com.micro.springstudy.web.jdkproxy;

import com.micro.springstudy.utils.MicroLogFactory;
import com.micro.springstudy.utils.MicroLogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * Created by Administrator on 2017/7/8 0008.
 */
public class MyInvocationHandler implements InvocationHandler {

    private static final MicroLogUtil log = MicroLogFactory.getLogger();

    //目标对象
    private Object target;

    //构造方法
    public MyInvocationHandler(Object object) {
        super();
        this.target = object;
    }

    //执行目标方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("-------------------before------------------");

        //执行目标对象的方法
        Object result = method.invoke(target, args);

        log.info("------------------after---------------------");

        return result;
    }

    //获取目标对象的代理对象
    public Object getproxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
