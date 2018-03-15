package com.windows3.controller;

import com.windows3.service.DepartmentService;
import com.windows3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 3 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


}
