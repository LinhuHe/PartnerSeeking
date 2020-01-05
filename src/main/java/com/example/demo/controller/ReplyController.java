package com.example.demo.controller;


import com.example.demo.entity.Reply;
import com.example.demo.entity.User;
import com.example.demo.sevice.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    public ReplyService replyService;

    @RequestMapping("/addReply")
    public boolean addReply(String uid,int pid)  //uid为应邀者的id
    {
        //判断重复
        System.out.println("addReply : uid:"+uid+" pid: "+pid);
        return replyService.addReply(new Reply(uid,pid));
    }

    @RequestMapping("/getReplyNumByPost")  //获取该帖子有多少回复数
    public int getReplyNumByPost(int pid)
    {
        return replyService.getReplyNumByPost(pid);
    }

    @RequestMapping("/getUserInfoByPid")
    public List<User> getUserInfoByPid(int pid) //找到某帖子下所有回复的人的信息
    {
        return replyService.getUserInfoByPid(pid);
    }



}
