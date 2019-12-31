package com.example.demo.sevice;


import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {
    @Autowired
    public ReplyMapper replyMapper;

    public boolean addReply(Reply r)
    {
        if(r==null)
        {
            System.out.println("addReply:r is null");
            return false;
        }
        else if(r.getrPid()==null||r.getrUid()==null)
        {
            System.out.println("addReply:r.* is null");
            return false;
        }
        replyMapper.insert(r);
        return true;
    }

    public boolean deleteReplyByPid(int pid)
    {
        return replyMapper.deleteReplyByPid(pid);
    }

    public int getReplyNumByPost(int pid)
    {
        return replyMapper.getReplyNumByPost(pid);
    }
}
