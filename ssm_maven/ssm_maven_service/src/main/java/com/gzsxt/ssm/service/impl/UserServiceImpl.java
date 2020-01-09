package com.gzsxt.ssm.service.impl;

import com.gzsxt.ssm.mapper.UserMapper;
import com.gzsxt.ssm.pojo.User;
import com.gzsxt.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }

    @Override
    public int insrt(User user) {
        return userMapper.insrt(user);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User login(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username,password);
    }
}
