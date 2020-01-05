package com.example.demo.controller;

import com.example.demo.FileUpload;
import com.example.demo.entity.Post;
import com.example.demo.sevice.PostService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    public PostService postService;

    @PostMapping("/addPost")
    public boolean addPsot(String pTittle, String pContent, String pUid, String pKeyword,  String pEndtime,MultipartFile Picfile,
                            Integer pCollectnum, Byte pPro, Byte pExi) throws ParseException
    {
        String pPic = "null";
        if(Picfile !=null) {
           pPic = FileUpload.writeUploadFile(Picfile, "Picture"); // 存入本地 返回hash名
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date enddate = simpleDateFormat.parse(pEndtime);

        return postService.addPsot(new Post(pTittle,pContent, pUid, pKeyword,  pPic,enddate,
                                             pCollectnum, pPro, pExi));
    }

    @RequestMapping("/findPostByUID")
    public List<Post> findPostByUID(String uid)
    {
        if(uid==null)
        {
            System.out.println("findPostByUID -> uid is null");
            return null;
        }
        else{
            System.out.println("findPostByUID -> uid:"  + uid);
        }
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

    @RequestMapping("/findPostByKeyword")
    public List<Post> findPostByKeyword(String keyword)
    {
        System.out.println("findPostByKeyword::keyword = "+keyword);
        return postService.findPostByKeyword(keyword);
    }

    @RequestMapping("/deletePostByPID")
    public int deletePostByPID(int pid)
    {
        return postService.deleteByPid(pid);
    }

    @RequestMapping("/iJoined")
    public List<Post> iJoined(String uid)  //“我参与的” ，返回uid reply的所有帖子
    {
        if(uid==null)
        {
            System.out.println("iJoined -> uid is null");
            return null;
        }
        else{
            System.out.println("iJoined -> uid:"  + uid);
        }

        return postService.iJoined(uid);
    }

    @RequestMapping("/searchPost")
    public List<Post> searchPost(String searchword)
    {
        return postService.searchPost(searchword);
    }


    @RequestMapping("/getPostByPrimerKey")
    public Post getPostByPrimerKey(int pid)
    {
        return postService.getPostByPrimerKey(pid);
    }

    @RequestMapping("/selectByPrimaryKeyNoBan")
    public Post selectByPrimaryKeyNoBan(int pid){
        return postService.selectByPrimaryKeyNoBan(pid);
    }
}
