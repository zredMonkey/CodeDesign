package cn.bugstack.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    /**
     * 查询用户 内部下单数量接口
     * @param userId
     * @return
     */
    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }

}
