package cn.bugstack.design.domain.service.engine.impl;

import cn.bugstack.design.domain.model.aggregates.TreeRich;
import cn.bugstack.design.domain.model.vo.EngineResult;
import cn.bugstack.design.domain.model.vo.TreeNode;
import cn.bugstack.design.domain.service.engine.EngineBase;

import java.util.Map;

/**
 * 决策引擎的实现
 */

public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程 一个树节点
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
