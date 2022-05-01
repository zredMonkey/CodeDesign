package cn.bugstack.design.cuisine.impl;


import cn.bugstack.design.cook.ICook;
import cn.bugstack.design.cuisine.ICuisine;

/**
 *
 * 四川（川菜）
 */
public class SiChuanCuisine implements ICuisine {
    // 厨师类
    private ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}