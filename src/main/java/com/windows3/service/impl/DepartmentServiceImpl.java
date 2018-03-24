package com.windows3.service.impl;

import com.windows3.dao.DepartmentDao;
import com.windows3.po.Department;
import com.windows3.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 3 on 2018/3/16.
 */
@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public boolean addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    @Override
    public List<Department> queryDepartment(Department department) {
        return departmentDao.queryDepartment(department);
    }

    @Override
    public List<Department> queryAll() {
        return departmentDao.queryAll();
    }
}
