package com.gzsxt.ssm.controller;

import com.gzsxt.ssm.pojo.User;
import com.gzsxt.ssm.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String userList(Model m){
        List<User> users = userService.selectList();

        m.addAttribute("users",users);
        return "userlist";
    }

    @RequestMapping("/deleteuser")
    public String deleteuser(Integer id){
        userService.deleteByPrimaryKey(id);

        return "redirect:/user/list.do";
    }
    @RequestMapping("/login")
    public String login01(@Param("username") String username,@Param("password") String password, Model m, HttpSession session){


            User loginuser = userService.login(username,password);
            if(loginuser == null){
                m.addAttribute("errorMsg","账号或者密码错误！");
                return "forward:/login.jsp";
            }else{
                session.setAttribute("loginuser",loginuser);
            }
            return "redirect:/user/list.do";

    }
}
