package cn.bugstack.design;

public interface LotteryService {

    /**
     * 定义摇号
     * @param uId
     * @return
     */
    LotteryResult doDraw(String uId);

}
