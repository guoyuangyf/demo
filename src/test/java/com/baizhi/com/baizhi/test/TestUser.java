package com.baizhi.com.baizhi.test;

import com.baizhi.DemoApplication;
import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestUser {
    @Autowired
    UserMapper userMapper;

    @Test
    public void name() {
        List<User> all = userMapper.findAll();
        all.forEach(System.out::println);
    }
}
