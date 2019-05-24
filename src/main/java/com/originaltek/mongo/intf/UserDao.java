package com.originaltek.mongo.intf;

import com.originaltek.mongo.entity.UserEntity;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 15:28
 * @todo 用户操作接口类
 */
public interface UserDao {


    public void saveUser(UserEntity user);
}
