package com.windows3.po;

import java.sql.Timestamp;

/**
 * Created by 3 on 2018/3/15.
 */


public class Train {
    private Integer id;
    private Integer adminId;
    private String trainTime;
    private String trainLong;
    private String trainAddress;
    private String trainContent;
    private Timestamp trainCreateTime;
    private Timestamp trainModifiedTime;

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

    public void setTrainTime(String trainTime) {
        this.trainTime = trainTime;
    }

    public String getTrainTime() {
        return trainTime;
    }

    public void setTrainLong(String trainLong) {
        this.trainLong = trainLong;
    }

    public String getTrainLong() {
        return trainLong;
    }

    public void setTrainAddress(String trainAddress) {
        this.trainAddress = trainAddress;
    }

    public String getTrainAddress() {
        return trainAddress;
    }

    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent;
    }

    public String getTrainContent() {
        return trainContent;
    }

    public void setTrainCreateTime(Timestamp trainCreateTime) {
        this.trainCreateTime = trainCreateTime;
    }

    public Timestamp getTrainCreateTime() {
        return trainCreateTime;
    }

    public void setTrainModifiedTime(Timestamp trainModifiedTime) {
        this.trainModifiedTime = trainModifiedTime;
    }

    public Timestamp getTrainModifiedTime() {
        return trainModifiedTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", trainTime='" + trainTime + '\'' +
                ", trainLong='" + trainLong + '\'' +
                ", trainAddress='" + trainAddress + '\'' +
                ", trainContent='" + trainContent + '\'' +
                ", trainCreateTime=" + trainCreateTime +
                ", trainModifiedTime=" + trainModifiedTime +
                '}';
    }
}

