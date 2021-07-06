package com.example.demo.mapper;

import com.example.demo.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 神隐`
 * 创建时间 2021-07-06 15:19
 */
@SpringBootTest
class TestMapperUser {

    @Resource
    UserMapper user;

    @Test
    void getUserById() {
        User user = this.user.getUserById(1);
        System.out.println(user);
    }
}