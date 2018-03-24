package com.windows3.po;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by 3 on 2018/3/15.
 */


public class ApplyForMessage implements Serializable {
    private Integer id;
    private Integer recruitMessageId;
    private Integer applyIsSee;
    private Integer applyIsNormal;
    private Timestamp applyCreateTime;
    private Integer resumeId;
    private Timestamp applyModifiedTime;
    private Resume resume;
    private RecruitMessage recruitMessage;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRecruitMessageId() {
        return recruitMessageId;
    }

    public void setRecruitMessageId(Integer recruitMessageId) {
        this.recruitMessageId = recruitMessageId;
    }

    public void setApplyIsSee(Integer applyIsSee) {
        this.applyIsSee = applyIsSee;
    }

    public Integer getApplyIsSee() {
        return applyIsSee;
    }

    public void setApplyIsNormal(Integer applyIsNormal) {
        this.applyIsNormal = applyIsNormal;
    }

    public Integer getApplyIsNormal() {
        return applyIsNormal;
    }

    public void setApplyCreateTime(Timestamp applyCreateTime) {
        this.applyCreateTime = applyCreateTime;
    }

    public Timestamp getApplyCreateTime() {
        return applyCreateTime;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setApplyModifiedTime(Timestamp applyModifiedTime) {
        this.applyModifiedTime = applyModifiedTime;
    }

    public Timestamp getApplyModifiedTime() {
        return applyModifiedTime;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public RecruitMessage getRecruitMessage() {
        return recruitMessage;
    }

    public void setRecruitMessage(RecruitMessage recruitMessage) {
        this.recruitMessage = recruitMessage;
    }

    @Override
    public String toString() {
        return "ApplyForMessage{" +
                "id=" + id +
                ", recruitMessageId=" + recruitMessageId +
                ", applyIsSee=" + applyIsSee +
                ", applyIsNormal=" + applyIsNormal +
                ", applyCreateTime=" + applyCreateTime +
                ", resumeId=" + resumeId +
                ", applyModifiedTime=" + applyModifiedTime +
                ", resume=" + resume +
                ", recruitMessage=" + recruitMessage +
                '}';
    }
}

