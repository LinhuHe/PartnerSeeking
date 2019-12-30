package com.example.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

    /**
     * 文件上传处理
     *
     * @param file
     * @return
     */
    public static String writeUploadFile(MultipartFile file,String module) {
        String filename = file.getOriginalFilename();
        String realpath = "F:/IDEA/mycode/ps/user/" +  module +"/";
        File fileDir = new File(realpath);
        if (!fileDir.exists())
            fileDir.mkdirs();

        String extname = FilenameUtils.getExtension(filename);  //获取扩展名
        String allowImgFormat = "gif,jpg,jpeg,png";
        if (!allowImgFormat.contains(extname.toLowerCase())) {
            return "NOT_IMAGE";
        }

        filename = Math.abs(file.getOriginalFilename().hashCode()) + RandomUtils.createRandomString( 4 ) + "." + extname; //原file hashcode+4位随机0-9组合+扩展名
        InputStream input = null;
        FileOutputStream fos = null;
        try {
            input = file.getInputStream();
            fos = new FileOutputStream(realpath + "/" + filename);
            IOUtils.copy(input, fos);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            IOUtils.closeQuietly(input);
            IOUtils.closeQuietly(fos);
        }
        return filename;
    }
}
