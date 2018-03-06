package com.zz.eureka.repository;

import com.zz.eureka.ServiceProviderApplication;
import com.zz.eureka.service.SequenceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Francis.zz on 2018/3/1.
 * springboot 测试用例，需要加载主应用类ServiceProviderApplication
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceProviderApplication.class)
public class SequenceTest {
    @Autowired
    private SequenceService sequenceService;

    @Test
    public void testSequence() {
        //System.out.println(sequenceService.getNextVal());
    }
}
