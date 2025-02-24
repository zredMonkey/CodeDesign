package cn.bugstack.design.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 内部订单MQ
 */
public class OrderMq {

    private String uid;           // 用户ID
    private String sku;           // 商品编号
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
