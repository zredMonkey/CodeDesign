package cn.bugstack.design.pay.channel;

import cn.bugstack.design.pay.mode.IPayMode;

import java.math.BigDecimal;

/**
 * 微信支付
 */
public class WxPay extends Pay {

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    /**
     * 划账
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟微信渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟微信渠道支付风控校验。uId：{} tradeId：{} security：{}", uId, tradeId, security);
        if (!security) {
            logger.info("模拟微信渠道支付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟微信渠道支付划账成功。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        return "0000";
    }

}
