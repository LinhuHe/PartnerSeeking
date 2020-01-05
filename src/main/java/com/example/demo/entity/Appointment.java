package com.example.demo.entity;

public class Appointment {
    private Integer aId;

    private String aInviterid;

    private String aInvitedid;

    private Integer aPid;

    public Appointment(){}

    public Appointment(String aInviterid,String aInvitedid,int aPid)
    {
        this.aInviterid = aInviterid;
        this.aInvitedid = aInvitedid;
        this.aPid = aPid;
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

    @Override
    public String toString() {
        return "Appointment{" +
                "aId=" + aId +
                ", aInviterid='" + aInviterid + '\'' +
                ", aInvitedid='" + aInvitedid + '\'' +
                ", aPid=" + aPid +
                '}';
    }
}