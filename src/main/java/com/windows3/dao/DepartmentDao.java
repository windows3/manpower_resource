package com.windows3.dao;

import com.windows3.po.Department;

/**
 * Created by 3 on 2018/3/16.
 */
public interface DepartmentDao {
     boolean addDepartment(Department department);

    Department queryDepartment(Department department);

}
