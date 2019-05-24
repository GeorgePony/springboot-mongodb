package com.originaltek.mongo.service;

import com.originaltek.mongo.entity.TcListEntity;
import com.originaltek.mongo.intf.TcListMongoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 16:50
 * @todo 收费流水录入mongo的实现类
 */
@Service
public class TcListMongoImpl implements TcListMongoDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void saveTcList(List<TcListEntity> tcListEntities) {
        mongoTemplate.insertAll(tcListEntities);
    }
}
