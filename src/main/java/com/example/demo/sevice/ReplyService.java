package com.example.demo.sevice;


import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReplyService {
    @Autowired
    public ReplyMapper replyMapper;

    @Autowired
    public UserMapper userMapper;
    @Autowired
    public UserService userService;

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

        System.out.println("addReply : r->" + r);
        int times = replyMapper.countByrUid(r.getrUid(),r.getrPid());

        if(times>0)
        {
            System.out.println("重复报名");
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

    public List<User> getUserInfoByPid(int pid) //找到某帖子下所有回复的人的信息
    {
        System.out.println("getUserInfoByPid-> pid:"+pid);
        List<Reply> ral = new ArrayList<>(); //储存某帖子的所有回复
        List<User> ual = new ArrayList<>(); //储存某帖子下的所有回复人的信息

        ReplyExample re = new ReplyExample();
        ReplyExample.Criteria criteria = re.createCriteria();
        criteria.andRPidEqualTo(pid);

        ral = replyMapper.selectByExample(re);

        if(ral.size()<=0) {
            System.out.println("getUserInfoByPid ral 为空, 没有这个帖子 或 没有回复");
        }

        for(int i=0;i<ral.size();i++)
        {
            try {
                ual.add(userService.getInfoByUid(ral.get(i).getrUid()).get(0));
            }
            catch (Exception e){
                System.out.println("getUserInfoByPid : "+e);
        }
        }

        return ual;
    }
}
