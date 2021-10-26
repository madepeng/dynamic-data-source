package com.ihuman.parentcircle;

import com.jiyu.ShardingjdbcXaApplication;
import com.jiyu.service.ShardingTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author madepeng
 * @title: ParentAudioMapperTest
 * @projectName parent-circle
 * @description: test
 * @date 2021/9/29 19:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShardingjdbcXaApplication.class)
public class ParentAudioMapperTest {

    @Autowired
    ShardingTestService shardingTest;


    @Test
    public void test() {
        shardingTest.testTransaction();
    }
}
