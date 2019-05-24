package com.originaltek.mongo;

import com.originaltek.mongo.entity.TcListEntity;
import com.originaltek.mongo.mapper.TcListDao;
import com.originaltek.mongo.intf.TcListMongoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 16:45
 * @todo 流水测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TcListTest {


    @Autowired
    private TcListDao tcListDao;

    @Autowired
    private TcListMongoDao tcListMongoDao;


    @Test
    public void testTcList() throws Exception {

        Map<String,Object> pageMap = new HashMap<>();
        pageMap.put("startNum" , 1);
        pageMap.put("endNum" , 100);
        List<TcListEntity> entityList =  tcListDao.qryTcList(pageMap);
        tcListMongoDao.saveTcList(entityList);
    }
}
