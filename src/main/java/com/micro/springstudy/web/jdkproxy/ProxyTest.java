package com.micro.springstudy.web.jdkproxy;

/*
 * Created by Administrator on 2017/7/8 0008.
 */
public class ProxyTest {

    public static void main(String[] args) {

        //实例化目标对象
        UserService userService = new UserServiceImpl();

        //实例化InvocationHandler
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);

        //根据目标对象生成代理对象
        UserService proxyService = (UserService) myInvocationHandler.getproxy();

        proxyService.add();
    }
}
