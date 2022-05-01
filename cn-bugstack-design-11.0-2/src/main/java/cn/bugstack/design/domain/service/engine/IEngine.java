package cn.bugstack.design.domain.service.engine;

import cn.bugstack.design.domain.model.aggregates.TreeRich;
import cn.bugstack.design.domain.model.vo.EngineResult;

import java.util.Map;

/**
 * 决策引擎接口
 */
public interface IEngine {

    /**
     *
     * @param treeId             决策树id
     * @param userId             用户id
     * @param treeRich           规则树
     * @param decisionMatter     事件map
     * @return
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
