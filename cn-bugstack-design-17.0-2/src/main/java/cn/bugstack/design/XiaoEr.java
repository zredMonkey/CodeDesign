package cn.bugstack.design;

import cn.bugstack.design.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 饭店小二，负责点单
 */
public class XiaoEr {

    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

    /**
     * 点菜
     * @param cuisine
     */
    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    /**
     * 下单
     */
    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }

}
