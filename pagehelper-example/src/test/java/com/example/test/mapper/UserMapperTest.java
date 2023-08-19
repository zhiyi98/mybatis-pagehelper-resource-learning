package com.example.test.mapper;

import com.example.test.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserMapperTest {


    @Resource
    private UserMapper userMapper;


    @Test
    void findAll() {
        PageHelper.startPage(2,2);
        List<User> all = userMapper.findAll();
        PageInfo<User> users = new PageInfo<>(all);
        System.out.println("users = " + users.getList());
    }

    @Test
    void findById() {
        User user = userMapper.findById(1L);
        System.out.println("user = " + user);
    }
}