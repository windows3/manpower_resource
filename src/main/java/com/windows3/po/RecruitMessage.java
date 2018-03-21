package com.windows3.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by 3 on 2018/3/20.
 */


public class RecruitMessage implements Serializable {
    private Integer id;
    private Integer adminId;
    private Integer postId;
    private BigDecimal recruitSalary;
    private Integer recruitNumber;
    private Integer recruitIsNormal;
    private Integer recruitIsRelease;
    private Timestamp recruitCreateTime;
    private Timestamp recruitModifiedTime;
    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public BigDecimal getRecruitSalary() {
        return recruitSalary;
    }

    public void setRecruitSalary(BigDecimal recruitSalary) {
        this.recruitSalary = recruitSalary;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setRecruitNumber(Integer recruitNumber) {
        this.recruitNumber = recruitNumber;
    }

    public Integer getRecruitNumber() {
        return recruitNumber;
    }

    public void setRecruitIsNormal(Integer recruitIsNormal) {
        this.recruitIsNormal = recruitIsNormal;
    }

    public Integer getRecruitIsNormal() {
        return recruitIsNormal;
    }

    public void setRecruitIsRelease(Integer recruitIsRelease) {
        this.recruitIsRelease = recruitIsRelease;
    }

    public Integer getRecruitIsRelease() {
        return recruitIsRelease;
    }

    public void setRecruitCreateTime(Timestamp recruitCreateTime) {
        this.recruitCreateTime = recruitCreateTime;
    }

    public Timestamp getRecruitCreateTime() {
        return recruitCreateTime;
    }

    public void setRecruitModifiedTime(Timestamp recruitModifiedTime) {
        this.recruitModifiedTime = recruitModifiedTime;
    }

    public Timestamp getRecruitModifiedTime() {
        return recruitModifiedTime;
    }

    @Override
    public String toString() {
        return "RecruitMessage{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", postId=" + postId +
                ", recruitSalary=" + recruitSalary +
                ", recruitNumber=" + recruitNumber +
                ", recruitIsNormal=" + recruitIsNormal +
                ", recruitIsRelease=" + recruitIsRelease +
                ", recruitCreateTime=" + recruitCreateTime +
                ", recruitModifiedTime=" + recruitModifiedTime +
                ", post=" + post +
                '}';
    }
}

