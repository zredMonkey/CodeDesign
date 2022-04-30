package cn.bugstack.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class POPOrderService {

    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    /**
     * 查询 用户 在第三方下单 首单
     * @param uId
     * @return
     */
    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }

}
