package com.originaltek.mongo.mapper;

import com.originaltek.mongo.entity.TcListEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 16:19
 * @todo 收费流水DAO
 */
@Repository
public interface TcListDao {

    /**
     * 查询收费流水
     * @return
     */
    List<TcListEntity> qryTcList(Map<String,Object> map);

}
