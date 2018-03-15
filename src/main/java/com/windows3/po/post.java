package com.windows3.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by 3 on 2018/3/15.
 */


public class Post  implements Serializable {
    private Integer id;
    private Integer departmentId;
    private Integer adminId;
    private String postName;
    private int postIsNormal;
    private Timestamp postCreateTime;
    private Timestamp postModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getPostIsNormal() {
        return postIsNormal;
    }

    public void setPostIsNormal(int postIsNormal) {
        this.postIsNormal = postIsNormal;
    }

    public Timestamp getPostCreateTime() {
        return postCreateTime;
    }

    public void setPostCreateTime(Timestamp postCreateTime) {
        this.postCreateTime = postCreateTime;
    }

    public Timestamp getPostModifiedTime() {
        return postModifiedTime;
    }

    public void setPostModifiedTime(Timestamp postModifiedTime) {
        this.postModifiedTime = postModifiedTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", adminId=" + adminId +
                ", postName='" + postName + '\'' +
                ", postIsNormal=" + postIsNormal +
                ", postCreateTime=" + postCreateTime +
                ", postModifiedTime=" + postModifiedTime +
                '}';
    }
}

