package org.mybatis.service;

import org.mybatis.domain.Node;

import java.util.List;

/**
 * 节点业务逻辑接口类
 * <p>
 * Created by bysocket on 24/01/2018.
 *
 * @author Administrator
 */
public interface NodeService {

    /**
     * 获取节点树
     *
     * @return 节点列表
     */
    List<Node> getNodeTree();
}
