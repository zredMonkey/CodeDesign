package cn.bugstack.design.pay.mode;

/**
 * 定义 支付模式 接口
 */
public interface IPayMode {

    /**
     * 安全校验
     *
     * @param uId
     * @return
     */
    boolean security(String uId);

}
