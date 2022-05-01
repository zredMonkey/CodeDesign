package cn.bugstack.design.cuisine.impl;

import cn.bugstack.design.cook.ICook;
import cn.bugstack.design.cuisine.ICuisine;

/**
 *
 * 山东（鲁菜）
 */
public class ShanDongCuisine implements ICuisine {
    // 厨师类
    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}