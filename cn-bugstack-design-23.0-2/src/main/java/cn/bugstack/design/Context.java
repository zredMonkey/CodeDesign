package cn.bugstack.design;

import java.math.BigDecimal;

/**
 * 组合、折扣策略
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * 计算优惠后的金额
     * @param couponInfo   优惠策略
     * @param skuPrice     SKU 金额
     * @return
     */
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}
