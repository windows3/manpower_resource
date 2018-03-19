package com.windows3.dao;

import com.windows3.po.Department;

import java.util.List;

/**
 * Created by 3 on 2018/3/16.
 */
public interface DepartmentDao {
     boolean addDepartment(Department department);

    List<Department> queryDepartment(Department department);

}
