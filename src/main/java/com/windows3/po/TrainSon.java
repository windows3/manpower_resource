package com.windows3.po;

import java.sql.Timestamp;

/**
 * Created by 3 on 2018/3/15.
 */


public class TrainSon {
    private Integer id;
    private Integer empId;
    private Integer trainId;
    private Timestamp trainSonCreateTime;
    private Timestamp trainSonModifiedTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainSonCreateTime(Timestamp trainSonCreateTime) {
        this.trainSonCreateTime = trainSonCreateTime;
    }

    public Timestamp getTrainSonCreateTime() {
        return trainSonCreateTime;
    }

    public void setTrainSonModifiedTime(Timestamp trainSonModifiedTime) {
        this.trainSonModifiedTime = trainSonModifiedTime;
    }

    public Timestamp getTrainSonModifiedTime() {
        return trainSonModifiedTime;
    }

    @Override
    public String toString() {
        return "TrainSon{" +
                "id=" + id +
                ", empId=" + empId +
                ", trainId=" + trainId +
                ", trainSonCreateTime=" + trainSonCreateTime +
                ", trainSonModifiedTime=" + trainSonModifiedTime +
                '}';
    }
}

