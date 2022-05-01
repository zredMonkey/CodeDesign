package cn.bugstack.design.domain.service.logic.impl;

import cn.bugstack.design.domain.service.logic.BaseLogic;

import java.util.Map;

/**
 * 性别节点：判断性别
 */
public class UserGenderFilter extends BaseLogic {

    /**
     *
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return
     */
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }

}
