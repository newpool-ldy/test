package com.gzsxt.ssm.service;

import com.gzsxt.ssm.pojo.User;

import java.util.List;

public interface UserService {

    public User selectByPrimaryKey(Integer id);


    public List<User> selectList();


    public int insrt(User user);


    public int updateByPrimaryKey(User user);


    public int deleteByPrimaryKey(Integer id);

    User login(String username, String password);
}
