package com.windows3.service;

import com.windows3.po.Admin;
import com.windows3.po.Department;

import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
public interface DepartmentService {


    boolean addDepartment(Department department);
    List<Department> queryDepartment(Department department);
}
