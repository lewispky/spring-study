package com.micro.springstudy.utils;

/*
 * Created by Administrator on 2017/7/6 0006.
 */
public class MicroLogFactory {
    public static MicroLogUtil getLogger() {
        return MicroLogUtil.getinstance();
    }
}
