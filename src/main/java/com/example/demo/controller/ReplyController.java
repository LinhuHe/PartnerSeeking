package com.example.demo.controller;


import com.example.demo.entity.Reply;
import com.example.demo.sevice.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplyController {

    @Autowired
    public ReplyService replyService;


    public boolean addReply(String uid,int pid)  //uid为应邀者的id
    {
        //return replyService.addReply(new Reply(uid,pid));
    }

}
