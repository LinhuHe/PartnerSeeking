package com.example.demo.entity;

import java.util.Date;

public class AppointUser {
    private Integer aId;

    private String aInviterid;

    private String aInvitedid;

    private Integer aPid;

    private String uNickname;

    private Byte uSex;

    private String uWechat;

    private String uHeadortrait;

    private String pTittle;

    public AppointUser(){}

    public AppointUser(Appointment a,User u, String pTittle)
    {
        if(a==null || u==null)
        {
            System.out.println("AppointUser a||u  is null");
            return ;
        }
        this.aId = a.getaId();
        this.aInviterid = a.getaInviterid();
        this.aInvitedid = a.getaInvitedid();
        this.aPid = a.getaPid();
        this.uNickname = u.getuNickname();
        this.uSex = u.getuSex();
        this.uWechat = u.getuWechat();
        this.uHeadortrait = u.getuHeadortrait();
        this.pTittle = pTittle;
    }

    public AppointUser(Integer aId, String aInviterid, String aInvitedid, Integer aPid, String uNickname, Byte uSex, String uWechat, String uHeadortrait) {
        this.aId = aId;
        this.aInviterid = aInviterid;
        this.aInvitedid = aInvitedid;
        this.aPid = aPid;
        this.uNickname = uNickname;
        this.uSex = uSex;
        this.uWechat = uWechat;
        this.uHeadortrait = uHeadortrait;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaInviterid() {
        return aInviterid;
    }

    public void setaInviterid(String aInviterid) {
        this.aInviterid = aInviterid;
    }

    public String getpTittle() {
        return pTittle;
    }

    public void setpTittle(String pTittle) {
        this.pTittle = pTittle;
    }

    public String getaInvitedid() {
        return aInvitedid;
    }

    public void setaInvitedid(String aInvitedid) {
        this.aInvitedid = aInvitedid;
    }

    public Integer getaPid() {
        return aPid;
    }

    public void setaPid(Integer aPid) {
        this.aPid = aPid;
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
}
