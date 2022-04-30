package cn.bugstack.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式 - 静态类使用
 */

public class Singleton_00 {

    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();

}
