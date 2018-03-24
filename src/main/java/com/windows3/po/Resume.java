package com.windows3.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by 3 on 2018/3/15.
 */


public class Resume implements Serializable {
    private Integer id;
    private Integer customerId;
    private String trueName;
    private String familyAddress;
    private String nowAddress;
    private String headPicture;
    private String graduateInstitutions;
    private String education;
    private String major;
    private String synopsis;
    private Timestamp resumeCreateTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress;
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setGraduateInstitutions(String graduateInstitutions) {
        this.graduateInstitutions = graduateInstitutions;
    }

    public String getGraduateInstitutions() {
        return graduateInstitutions;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setResumeCreateTime(Timestamp resumeCreateTime) {
        this.resumeCreateTime = resumeCreateTime;
    }

    public Timestamp getResumeCreateTime() {
        return resumeCreateTime;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", trueName='" + trueName + '\'' +
                ", familyAddress='" + familyAddress + '\'' +
                ", nowAddress='" + nowAddress + '\'' +
                ", headPicture='" + headPicture + '\'' +
                ", graduateInstitutions='" + graduateInstitutions + '\'' +
                ", education='" + education + '\'' +
                ", major='" + major + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", resumeCreateTime=" + resumeCreateTime +
                '}';
    }
}

