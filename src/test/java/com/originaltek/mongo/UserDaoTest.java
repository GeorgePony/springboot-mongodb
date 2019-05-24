package com.originaltek.mongo;

import com.originaltek.mongo.entity.UserEntity;
import com.originaltek.mongo.intf.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 15:33
 * @todo 用户测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;



    @Test
    public void testSaveUser() throws Exception {
        UserEntity user=new UserEntity();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userDao.saveUser(user);
    }
}
