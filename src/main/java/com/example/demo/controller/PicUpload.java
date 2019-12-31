package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.*;

@RestController
@RequestMapping("/Pictur")
public class PicUpload {

    @PostMapping("/upload")  //必须为post
    public Object upload(@RequestParam("file") MultipartFile  file) {  //参数名为file，且不可为空

        String filename = FileUpload.writeUploadFile(file,"Picture");  //图片存储在本地，并返回hash后的图片名

        return filename;

    }


}