package com.example.demo.entity;

public class Reply {
    private Integer rId;

    private String rUid;

    private Integer rPid;

    public Reply(){}

    public Reply(String rUid, Integer rPid) {
        this.rUid = rUid;
        this.rPid = rPid;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrUid() {
        return rUid;
    }

    public void setrUid(String rUid) {
        this.rUid = rUid;
    }

    public Integer getrPid() {
        return rPid;
    }

    public void setrPid(Integer rPid) {
        this.rPid = rPid;
    }
}