package cn.bugstack.design.cuisine.impl;

import cn.bugstack.design.cook.ICook;
import cn.bugstack.design.cuisine.ICuisine;

/**
 *
 * 广东（粤菜）
 */
public class GuangDoneCuisine implements ICuisine {
    // 厨师类
    private ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
