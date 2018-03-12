package com.windows3.service.impl;

import com.windows3.dao.AdminDao;
import com.windows3.po.Admin;
import com.windows3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 3 on 2018/3/9.
 */
@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin login(Admin admin) {
        if (admin == null) {
            return null;
        }
        return adminDao.login(admin);
    }

}
