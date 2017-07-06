package com.micro.springstudy.utils;

import java.util.Properties;

/*
 * Created by Administrator on 2017/7/6 0006.
 */
public class PropertiesUtils {
    private static Properties commoninfosProperties;
    private static final String commoninfosFileName = "commoninfos.properties";

    static {
        commoninfosProperties = new Properties();

        try {
            commoninfosProperties.load(ClassLoader.getSystemResourceAsStream(commoninfosFileName));
            //log.info("commoninfos.properties");
        } catch (Exception e) {
            //log.info("PropertiesUtils初始化失败", e);
        }
    }

    public static String getCommonInfoPropertiesValue(String key) {
        return commoninfosProperties.getProperty(key);
    }
}
