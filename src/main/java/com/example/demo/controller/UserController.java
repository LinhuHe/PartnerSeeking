package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/addUserInfo")
    public boolean addUserInfo(String uid, String nickname, Byte sex, String headortrait)
    {
       // System.out.println("addUserInfo-> uid: "+uid+" nickname： "+nickname+" sex: "+sex+" wechat: "+wechat+" head: "+headortrait);


        return userService.addUserInfo(new User(uid,nickname,sex,headortrait));
    }

    @RequestMapping("/getInfoByUid")
    public List<User> getInfoByUid(String uid)
    {
        if(uid == null)
        {
            System.out.println("getInfoByUid->uid is null");
            return null;
        }
        else{
            System.out.println("getInfoByUid->uid is"+uid);
        }
        return userService.getInfoByUid(uid);
    }

}
