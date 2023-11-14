package com.yupi.usercenter;

import com.yupi.usercenter.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@SpringBootTest
class UserCenterApplicationTests {

    @Resource
    UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(userMapper);
    }

}
