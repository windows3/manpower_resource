package com.windows3.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by 3 on 2018/1/17.
 */
public class Admin implements Serializable{
    public   static   final   int  ADMIN_IS_NORMAL=1;
    public   static   final   int  ADMIN_IS_NOT_NORMAL=0;
    private Integer id;
    private String adminName;
    private String adminPassword;
    private Integer  adminIsNormal;
    private Timestamp  adminCreateTime;
    private Timestamp adminModifiedTime;

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getAdminIsNormal() {
        return adminIsNormal;
    }

    public void setAdminIsNormal(Integer adminIsNormal) {
        this.adminIsNormal = adminIsNormal;
    }

    public Timestamp getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Timestamp adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public Timestamp getAdminModifiedTime() {
        return adminModifiedTime;
    }

    public void setAdminModifiedTime(Timestamp adminModifiedTime) {
        this.adminModifiedTime = adminModifiedTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminIsNormal=" + adminIsNormal +
                ", adminCreateTime=" + adminCreateTime +
                ", adminModifiedTime=" + adminModifiedTime +
                '}';
    }
}
