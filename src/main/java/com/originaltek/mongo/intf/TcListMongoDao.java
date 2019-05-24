package com.originaltek.mongo.intf;

import com.originaltek.mongo.entity.TcListEntity;

import java.util.List;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 16:48
 * @todo mongodb的收费流水DAO层
 */
public interface TcListMongoDao {

    /**
     * 录入收费流水
     * @param tcListEntities
     */
    void saveTcList(List<TcListEntity> tcListEntities);
}
