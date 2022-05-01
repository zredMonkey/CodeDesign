package cn.bugstack.design.cook.impl;

import cn.bugstack.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 山东菜实现
 */
public class ShanDongCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    public void doCooking() {
        logger.info("山东厨师，烹饪鲁菜，宫廷菜系，以孔府风味为龙头");
    }

}
