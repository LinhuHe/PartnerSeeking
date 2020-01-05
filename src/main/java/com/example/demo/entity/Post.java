package com.example.demo.entity;

import java.util.Date;

public class Post {
    private Integer pId;

    private String pTittle;

    private String pKeyword;

    private String pContent;

    private String pPic;

    private String pUid;

    private Date pPosttime;

    private Date pEndtime;

    private Integer pCollectnum = 0;

    private Byte pBan = 0;

    private Byte pPro = 0;

    private Byte pExi = 0;

    public Post(){this.pPosttime = new Date();}

    public Post(String pTittle, String pContent, String pUid,  String pKeyword, String pPic,Date pEndtime,
                 Integer pCollectnum, Byte pPro, Byte pExi)
    {
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pUid = pUid;
        this.pEndtime = pEndtime;

        this.pKeyword = pKeyword;
        this.pPic = pPic;
        //this.pCollectnum = 0;  参加人数
        this.pPro = pPro;
        this.pExi = pExi;

        this.pPosttime = new Date();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpTittle() {
        return pTittle;
    }

    public void setpTittle(String pTittle) {
        this.pTittle = pTittle;
    }

    public String getpKeyword() {
        return pKeyword;
    }

    public void setpKeyword(String pKeyword) {
        this.pKeyword = pKeyword;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getpPic() {
        return pPic;
    }

    public void setpPic(String pPic) {
        this.pPic = pPic;
    }

    public String getpUid() {
        return pUid;
    }

    public void setpUid(String pUid) {
        this.pUid = pUid;
    }

    public Date getpPosttime() {
        return pPosttime;
    }

    public void setpPosttime(Date pPosttime) {
        this.pPosttime = pPosttime;
    }

    public Date getpEndtime() {
        return pEndtime;
    }

    public void setpEndtime(Date pEndtime) {
        this.pEndtime = pEndtime;
    }

    public Integer getpCollectnum() {
        return pCollectnum;
    }

    public void setpCollectnum(Integer pCollectnum) {
        this.pCollectnum = pCollectnum;
    }

    public Byte getpBan() {
        return pBan;
    }

    public void setpBan(Byte pBan) {
        this.pBan = pBan;
    }

    public Byte getpPro() {
        return pPro;
    }

    public void setpPro(Byte pPro) {
        this.pPro = pPro;
    }

    public Byte getpExi() {
        return pExi;
    }

    public void setpExi(Byte pExi) {
        this.pExi = pExi;
    }

    @Override
    public String toString() {
        return "Post{" +
                "pId=" + pId +
                ", pTittle='" + pTittle + '\'' +
                ", pKeyword='" + pKeyword + '\'' +
                ", pContent='" + pContent + '\'' +
                ", pPic='" + pPic + '\'' +
                ", pUid='" + pUid + '\'' +
                ", pPosttime=" + pPosttime +
                ", pEndtime=" + pEndtime +
                '}';
    }
}