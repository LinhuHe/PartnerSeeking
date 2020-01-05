package com.example.demo.sevice;


import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    public PostMapper postmapper;
    @Autowired
    public ReplyService replyService;

    public boolean addPsot(Post p)
    {
        if(p==null)
        {
            System.out.println("addPsot:p id null");
            return false;
        }
        else if(p.getpTittle()==null)
        {
            System.out.println("addPsot:p.tittle is null");
            return false;
        }
        else if(p.getpUid()==null)
        {
            System.out.println("addPost:p.UId IS NULL");
            return false;
        }

        System.out.println("PostService::addPsot::p-> "+p);

        postmapper.insert(p);
        return true;
    }

    public List<Post> findPostByUID(String uid)
    {
        PostExample pe = new PostExample();
        PostExample.Criteria criteria = pe.createCriteria();

        criteria.andPUidEqualTo(uid);
        criteria.andPBanEqualTo(Byte.valueOf("0"));

        return postmapper.selectByExample(pe);
    }

    public List<Post> findPostByPostTimeAsc()
    {
        return postmapper.findPostByPostTimeAsc();
    }
    public List<Post> findPostByPostTimeDesc()
    {
        return postmapper.findPostByPostTimeDesc();
    }
    public List<Post> findPostByEndTimeAsc()
    {
        return postmapper.findPostByEndTimeAsc();
    }
    public List<Post> findPostByEndTimeDesc()
    {
        return postmapper.findPostByEndTimeDesc();
    }

    public int deleteByPid(int pid)
    {
        return postmapper.deleteByPrimaryKey(pid);
    }

    public List<Post> findPostByKeyword(String keyword)
    {
        PostExample pe = new PostExample();
        PostExample.Criteria criteria = pe.createCriteria();

        criteria.andPKeywordEqualTo(keyword);
        criteria.andPBanEqualTo(Byte.valueOf("0"));

        return postmapper.selectByExample(pe);
    }

    public List<Post> iJoined(String uid)  //“我参与的” ，返回我reply的所有帖子
    {
        ArrayList<Integer> al = new ArrayList(replyService.findPidByUid(uid));
        System.out.println("al->"+al.toString());
        ArrayList<Post> alpost = new ArrayList<>();

        for(int i=0;i<al.size();i++)
        {
            Post t = postmapper.selectByPrimaryKey(al.get(i));
            if(t!=null)  //如果那个帖子已经被appointment了 则会返回null
            alpost.add(t);
            //System.out.println("alpost"+alpost.toString());
        }

        return alpost;
    }

    public int setPostUnable(int pid,byte stander) //addappointment 中调用
    {
        return postmapper.setPostUnable(pid,stander);
    }

    public List<Post> searchPost(String searchword)
    {
        return postmapper.searchPost(searchword);
    }

    public Post getPostByPrimerKey(int pid)
    {
        return postmapper.selectByPrimaryKey(pid);
    }

    public Post selectByPrimaryKeyNoBan(int pid){
        return postmapper.selectByPrimaryKeyNoBan(pid);
    }
}
