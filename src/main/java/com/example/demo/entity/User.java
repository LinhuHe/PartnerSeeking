package com.example.demo.entity;

public class User {
    private String uId = "0";

    private String uNickname;

    private Byte uSex;

    private String uWechat;

    private String uHeadortrait;

    private Integer uProvinceid = 0;

    private Integer uCityid =0 ;

    private Byte uIdentity = 0;

    private Byte uMerrec = 0;

    private Byte uBan = 0;

    private Byte uExi = 0;

    public User(){}

    public User(String uId, String uNickname, Byte uSex, String uHeadortrait) {
        this.uId = uId;
        this.uNickname = uNickname;
        this.uSex = uSex;
        this.uHeadortrait = uHeadortrait;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public Byte getuSex() {
        return uSex;
    }

    public void setuSex(Byte uSex) {
        this.uSex = uSex;
    }

    public String getuWechat() {
        return uWechat;
    }

    public void setuWechat(String uWechat) {
        this.uWechat = uWechat;
    }

    public String getuHeadortrait() {
        return uHeadortrait;
    }

    public void setuHeadortrait(String uHeadortrait) {
        this.uHeadortrait = uHeadortrait;
    }

    public Integer getuProvinceid() {
        return uProvinceid;
    }

    public void setuProvinceid(Integer uProvinceid) {
        this.uProvinceid = uProvinceid;
    }

    public Integer getuCityid() {
        return uCityid;
    }

    public void setuCityid(Integer uCityid) {
        this.uCityid = uCityid;
    }

    public Byte getuIdentity() {
        return uIdentity;
    }

    public void setuIdentity(Byte uIdentity) {
        this.uIdentity = uIdentity;
    }

    public Byte getuMerrec() {
        return uMerrec;
    }

    public void setuMerrec(Byte uMerrec) {
        this.uMerrec = uMerrec;
    }

    public Byte getuBan() {
        return uBan;
    }

    public void setuBan(Byte uBan) {
        this.uBan = uBan;
    }

    public Byte getuExi() {
        return uExi;
    }

    public void setuExi(Byte uExi) {
        this.uExi = uExi;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", uNickname='" + uNickname + '\'' +
                ", uSex=" + uSex +
                ", uWechat='" + uWechat + '\'' +
                ", uHeadortrait='" + uHeadortrait + '\'' +
                ", uProvinceid=" + uProvinceid +
                ", uCityid=" + uCityid +
                ", uIdentity=" + uIdentity +
                ", uMerrec=" + uMerrec +
                ", uBan=" + uBan +
                ", uExi=" + uExi +
                '}';
    }
}