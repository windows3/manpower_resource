package com.windows3.service;

import com.windows3.po.Admin;
import com.windows3.po.Department;

/**
 * Created by 3 on 2018/3/9.
 */
public interface DepartmentService {


    boolean addDepartment(Department department);
    Department queryDepartment(Department department);
}
