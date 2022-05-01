package cn.bugstack.design.domain.service.logic.impl;

import cn.bugstack.design.domain.service.logic.BaseLogic;

import java.util.Map;

/**
 * 年龄节点：判断年龄
 */
public class UserAgeFilter extends BaseLogic {

    /**
     *
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return
     */
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
