package com.originaltek.mongo.service;

import com.originaltek.mongo.entity.UserEntity;
import com.originaltek.mongo.intf.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 15:32
 * @todo 用户操作
 */
@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void saveUser(UserEntity user) {
        mongoTemplate.save(user);
    }
}
