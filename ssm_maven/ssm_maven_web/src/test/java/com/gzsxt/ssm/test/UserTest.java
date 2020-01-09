package com.gzsxt.ssm.test;

import com.gzsxt.ssm.pojo.User;
import com.gzsxt.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectList(){
        User user = userService.selectByPrimaryKey(4);
        System.out.println(user);
    }

}
