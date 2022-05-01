package cn.bugstack.design.domain.service.logic;


import cn.bugstack.design.domain.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * 抽象类  对接口的实现，提供最基本的通用方法
 *
 * 决策抽象类提供基础服务
 */

public abstract class BaseLogic implements LogicFilter {

    /**
     *
     * @param matterValue          决策值
     * @param treeNodeLinkList
     * @return
     */
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink nodeLine : treeNodeLinkList) {
            if (decisionLogic(matterValue, nodeLine)){
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    /**
     * 定义该抽象方法，让每一个实现接口的类都必须按照规则提供决策值，这个决策值用于进行逻辑判断
     *
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return
     */
    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    /**
     *
     * 决策罗晋
     *
     * 定义了基本的决策方法：1、2、3、4、5 表示  等于、大于、小于、小于等于、大于或等于
     *
     * @param matterValue
     * @param nodeLink
     * @return
     */
    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }

}
