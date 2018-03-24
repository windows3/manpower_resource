package com.windows3.po;

import java.sql.Timestamp;

/**
 * Created by 3 on 2018/3/15.
 */


public class Emp {
    private Integer id;
    private String empName;
    private String empPassword;
    private Integer empStatus;
    private Integer empSalary;
    private Integer empIsTrain;
    private Timestamp hiredate;
    private Timestamp empCreateTime;
    private Timestamp empModifiedTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpStatus(Integer empStatus) {
        this.empStatus = empStatus;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getEmpStatus() {
        return empStatus;
    }

    public void setEmpIsTrain(Integer empIsTrain) {
        this.empIsTrain = empIsTrain;
    }

    public Integer getEmpIsTrain() {
        return empIsTrain;
    }

    public void setHiredate(Timestamp hiredate) {
        this.hiredate = hiredate;
    }

    public Timestamp getHiredate() {
        return hiredate;
    }

    public void setEmpCreateTime(Timestamp empCreateTime) {
        this.empCreateTime = empCreateTime;
    }

    public Timestamp getEmpCreateTime() {
        return empCreateTime;
    }

    public void setEmpModifiedTime(Timestamp empModifiedTime) {
        this.empModifiedTime = empModifiedTime;
    }

    public Timestamp getEmpModifiedTime() {
        return empModifiedTime;
    }
}

