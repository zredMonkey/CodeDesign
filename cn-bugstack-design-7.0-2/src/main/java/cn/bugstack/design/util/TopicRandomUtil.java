package cn.bugstack.design.util;

import java.util.*;

/**
 * 题目混排工具包
 */

public class TopicRandomUtil {

    /**
     * 乱序Map元素，记录对应答案key
     * @param option 题目
     *                    格式： A   XXX
     *                          B   XXX
     *                          C   XXX
     *                          D   XXX
     * @param key    答案
     * @return Topic 乱序后 {A=c., B=d., C=a., D=b.}
     */
    static public Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        // set集合转成List
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        // shuffle(list) 通过使用默认随机性对指定的列表元素进行随机重新排序
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>();
        int idx = 0;
        // 混排后正确答案的位置
        String keyNew = "";
        // keySet为正确顺序
        // 将原先四个选项的顺序  排入  混排后的顺序
        for (String next : keySet) {
            // 随机key
            String randomKey = keyList.get(idx++);
            // key为正确答案，next为循环变量，记录正确答案的位置
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }

}
