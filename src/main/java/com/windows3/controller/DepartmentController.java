package com.windows3.controller;

import com.windows3.po.Department;
import com.windows3.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/department.create")
    public   String  create(){

        return "department/addDepartment";
    }
    @RequestMapping(value = "/department.add")
    public   String  addDepartment(@ModelAttribute  Department department ,Model model){

        if (department == null) {
            model.addAttribute("info","增加失败");
            return "department/addDepartment";
        }
        List<Department> departments = departmentService.queryDepartment(department);
        if (departments.isEmpty()||departments==null) {
            boolean b=departmentService.addDepartment(department);
            if(b){
                model.addAttribute("info","增加成功");
                return "department/addDepartment";
            }
        }
        model.addAttribute("info","增加失败,不能增加已有的部门");
        return "department/addDepartment";

    }

}
