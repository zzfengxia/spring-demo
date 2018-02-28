package com.zz.springdemo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by zzxia on 2016/2/20.
 * 描述：读取.properties属性文件的内容
 */
public class PropertiesUtil {
    private static Properties properties = new Properties();
    private static String path;
    private static FileInputStream input;
    static {
        path = PropertiesUtil.class.getResource("/").getPath();
        path = path.replace("bin", "conf");
        path += "config.properties";
    }

    public static String get(String key) {
        String result = null;
        try {
            input = new FileInputStream(path);
            properties.load(input);
            result = properties.getProperty(key);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PropertiesUtil.get("url.ignoreUrlMode"));
    }

}
