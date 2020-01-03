package com.example.demo.sevice;


import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Integer> findPidByUid(String uid)  //通过传入的uid找到这个uid reply的所有pid ， 用于postController中的iJoined方法
    {
        if(uid == null) {
            System.out.println("findPidByUid -> uid is null");
            return null;
        }
        return replyMapper.findPidByUid(uid);
    }
}
