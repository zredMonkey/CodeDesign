package cn.bugstack.design.cuisine.impl;

import cn.bugstack.design.cook.ICook;
import cn.bugstack.design.cuisine.ICuisine;

/**
 *
 * 江苏（苏菜）
 */
public class JiangSuCuisine implements ICuisine {

    // 厨师类
    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}