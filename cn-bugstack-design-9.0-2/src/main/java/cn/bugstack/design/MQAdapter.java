package cn.bugstack.design;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * MQ 适配 (MQ消息统一适配类)
 *
 * 主要用于把不同类型中的MQ中的各种属性映射成需要的属性并返回，如： 用户id uId->userId
 */
public class MQAdapter {

    /**
     *
     * @param strJson 接收到的MQ消息
     * @param link 准确描述了当前MQ中某个属性名称，映射为指定的某个属性名称
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    /**
     *
     * @param obj 接收到的MQ消息
     * @param link 准确描述了当前MQ中某个属性名称，映射为指定的某个属性名称
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }

}
