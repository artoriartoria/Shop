package com.aishang.model;

import java.util.Date;

public class Image {
    private String image_id;
    private String name;
    private String old_name;
    private String path;
    private Date date;
    private String pid;

    @Override
    public String toString() {
        return "Image{" +
                "image_id='" + image_id + '\'' +
                ", name='" + name + '\'' +
                ", old_name='" + old_name + '\'' +
                ", path='" + path + '\'' +
                ", date=" + date +
                ", pid='" + pid + '\'' +
                '}';
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld_name() {
        return old_name;
    }

    public void setOld_name(String old_name) {
        this.old_name = old_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
