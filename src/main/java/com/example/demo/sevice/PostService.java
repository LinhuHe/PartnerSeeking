package com.example.demo.sevice;


import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    public PostMapper postmapper;

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

        return postmapper.selectByExample(pe);
    }
}
