package cn.bugstack.design;

/**
 * 单例模式-Effective Java 推荐使用的枚举单例(线程安全)
 */
public enum Singleton_07 {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }

}
