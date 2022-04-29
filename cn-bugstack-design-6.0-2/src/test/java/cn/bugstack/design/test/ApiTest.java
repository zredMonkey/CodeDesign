package cn.bugstack.design.test;

import cn.bugstack.design.Builder;
import org.junit.Test;

/**
 * 建造者适用场景：当一些基本材料不变，而其组合经常变化
 */

public class ApiTest {

    @Test
    public void test_Builder(){
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

}
