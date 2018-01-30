package org.mybatis.dao;

import org.mybatis.domain.Node;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 节点 DAO 接口类
 * <p>
 * Created by bysocket on 24/01/2018.
 *
 * @author Administrator
 */
@Repository
public interface NodeDao {

    /**
     * 获取节点树
     *
     * @return 节点列表
     */
    List<Node> getNodeTree();
}
