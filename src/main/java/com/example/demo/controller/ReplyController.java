package com.example.demo.controller;


import com.example.demo.entity.Reply;
import com.example.demo.sevice.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    public ReplyService replyService;

    @RequestMapping("/addReply")
    public boolean addReply(String uid,int pid)  //uid为应邀者的id
    {
        return replyService.addReply(new Reply(uid,pid));
    }

    @RequestMapping("/getReplyNumByPost")
    public int getReplyNumByPost(int pid)
    {
        return replyService.getReplyNumByPost(pid);
    }

}
