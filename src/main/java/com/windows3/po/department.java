package com.windows3.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by 3 on 2018/3/15.
 */
public class Department implements Serializable {
    private Integer id;
    private String departmentName;
   private Timestamp departmentCreateTime;
    private Timestamp  departmentModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Timestamp getDepartmentCreateTime() {
        return departmentCreateTime;
    }

    public void setDepartmentCreateTime(Timestamp departmentCreateTime) {
        this.departmentCreateTime = departmentCreateTime;
    }

    public Timestamp getDepartmentModifiedTime() {
        return departmentModifiedTime;
    }

    public void setDepartmentModifiedTime(Timestamp departmentModifiedTime) {
        this.departmentModifiedTime = departmentModifiedTime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCreateTime=" + departmentCreateTime +
                ", departmentModifiedTime=" + departmentModifiedTime +
                '}';
    }
}
