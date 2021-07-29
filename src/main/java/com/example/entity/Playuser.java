package com.example.entity;

import java.util.Date;

public class Playuser {
    private Integer playid;

    private String playname;

    private String playpwd;

    private String playphone;

    private Date playstartime;

    private Integer playstate;

    public Integer getPlayid() {
        return playid;
    }

    public void setPlayid(Integer playid) {
        this.playid = playid;
    }

    public String getPlayname() {
        return playname;
    }

    public void setPlayname(String playname) {
        this.playname = playname == null ? null : playname.trim();
    }

    public String getPlaypwd() {
        return playpwd;
    }

    public void setPlaypwd(String playpwd) {
        this.playpwd = playpwd == null ? null : playpwd.trim();
    }

    public String getPlayphone() {
        return playphone;
    }

    public void setPlayphone(String playphone) {
        this.playphone = playphone == null ? null : playphone.trim();
    }

    public Date getPlaystartime() {
        return playstartime;
    }

    public void setPlaystartime(Date playstartime) {
        this.playstartime = playstartime;
    }

    public Integer getPlaystate() {
        return playstate;
    }

    public void setPlaystate(Integer playstate) {
        this.playstate = playstate;
    }
}