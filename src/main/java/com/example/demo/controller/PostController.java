package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.sevice.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    public PostService postService;

    @RequestMapping("/addPost")
    public boolean addPsot(String pTittle, String pContent, String pUid, Date pEndtime, String pKeyword, Integer pNum,
                            Integer pCollectnum, Byte pBan, Byte pPro, Byte pExi)
    {
        return postService.addPsot(new Post(pTittle,pContent, pUid,pEndtime, pKeyword,  pNum,
                                             pCollectnum, pBan, pPro, pExi));
    }

    @RequestMapping("/findPostByUID/{uid}")
    public List<Post> findPostByUID(@PathVariable("uid") String uid)
    {
        return postService.findPostByUID(uid);
    }

    @RequestMapping("/findPostByPostTimeAsc")
    public List<Post> findPostByPostTimeAsc()
    {
        return postService.findPostByPostTimeAsc();
    }
    @RequestMapping("/findPostByPostTimeDesc")
    public List<Post> findPostByPostTimeDesc()
    {
        return postService.findPostByPostTimeDesc();
    }
    @RequestMapping("/findPostByEndTimeAsc")
    public List<Post> findPostByEndTimeAsc()
    {
        return postService.findPostByEndTimeAsc();
    }
        @RequestMapping("/findPostByEndTimeDesc")
    public List<Post> findPostByEndTimeDesc()
    {
        return postService.findPostByEndTimeDesc();
    }
}
