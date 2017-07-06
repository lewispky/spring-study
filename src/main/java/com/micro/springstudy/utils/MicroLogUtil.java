package com.micro.springstudy.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Created by Administrator on 2017/7/6 0006.
 */
public class MicroLogUtil {
    private Logger log;

    private static class SingletonHolder {
        private static MicroLogUtil microLogUtil = new MicroLogUtil();
    }

    public static MicroLogUtil getinstance() {
        return SingletonHolder.microLogUtil;
    }

    private MicroLogUtil() {
        log = LoggerFactory.getLogger(MicroLogUtil.class);
    }

    public void info(String info) {
        String infoFormat = generatorPrixMsg()+"traceId="+ThreadLocalUtil.getTraceId()+"  " +info;
        log.info(infoFormat);
    }

    private static String generatorPrixMsg() {
        final StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String msg = "";
        if ((stackTraceElement.length > 3) && (stackTraceElement[3] != null)) {
            final StackTraceElement stack = stackTraceElement[3];
            final String clazzName = stack.getClassName();
            msg = clazzName + "." + stack.getMethodName() + "("+clazzName.substring(clazzName.lastIndexOf(".") + 1, clazzName.length())
                    +".java:"+ stack.getLineNumber() + ") - ";
        }
        return msg;
    }
}
