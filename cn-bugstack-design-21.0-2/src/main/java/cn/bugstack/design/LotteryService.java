package cn.bugstack.design;

import cn.bugstack.design.event.EventManager;
import cn.bugstack.design.event.listener.MQEventListener;
import cn.bugstack.design.event.listener.MessageEventListener;

/**
 * 业务抽象类接口
 */
public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        // 核心业务流程
        LotteryResult lotteryResult = doDraw(uId);

        // 这部分是增加的通知  额外的辅助流程
        // 需要什么通知就给调用什么方法
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.Message, lotteryResult);

        return lotteryResult;
    }

    /**
     * 注意  方法的定义使用是 protected
     * @param uId
     * @return
     */
    protected abstract LotteryResult doDraw(String uId);

}
