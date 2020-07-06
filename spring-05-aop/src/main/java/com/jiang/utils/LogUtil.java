package com.jiang.utils;

        import java.util.Arrays;

/**
 * @Title:
 * @author: JiangPeng
 */
public class LogUtil {
    public static void logStart(Object...objects){
        System.out.println("【xx】方法开始了，它的参数值是【"+ Arrays.asList(objects) +"】");
    }
}
