package cn.bugstack.design;

/**
 * 单例模式-懒汉模式(线程安全)
 */

public class Singleton_02 {

    private static Singleton_02 instance;

    private Singleton_02() {
    }

    // 注意 这里加了锁
    public static synchronized Singleton_02 getInstance(){
        if (null != instance) return instance;
        return new Singleton_02();
    }

}
