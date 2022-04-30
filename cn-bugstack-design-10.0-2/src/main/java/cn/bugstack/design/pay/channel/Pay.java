package cn.bugstack.design.pay.channel;

import cn.bugstack.design.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 支付类型 抽象类
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    /**
     * 桥接接口- 桥接模式核心
     */
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 划账接口
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
