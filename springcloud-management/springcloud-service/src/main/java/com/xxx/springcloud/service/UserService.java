package com.xxx.springcloud.service;

import com.xxx.springcloud.mapper.UserMapper;
import com.xxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/28 16:46
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUser() {
        return userMapper.selectAll();
    }

    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
