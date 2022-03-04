package com.gan.controller;

import com.gan.mapper.UserMapper;
import com.gan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    /*查询全部用户*/
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }
    /*增加一个用户*/
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(3,"王五","789",2,"5678"));
        return "ok";
    }
    /*修改一个用户*/
    @GetMapping("updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(1,"张三","456",2,"6789"));
        return "ok";
    }
    /*删除用户*/
    @GetMapping("deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(2);
        return "ok";
    }
}
