package com.windows3.controller;

import com.sun.java.swing.plaf.motif.MotifBorders;
import com.windows3.po.Admin;
import com.windows3.po.Department;
import com.windows3.po.Post;
import com.windows3.service.AdminService;
import com.windows3.service.DepartmentService;
import com.windows3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/post")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/post.create")
    public String create() {

        return "post/index";
    }

    @RequestMapping(value = "/addPost.add")
    public String addPost(Model model) {
        List<Department> departments=departmentService.queryAll();
        if (departments == null||departments.isEmpty()) {
            model.addAttribute("info","暂无部门,请添加");
            return "department/addDepartment";
        }
        model.addAttribute("departments",departments);
//        List<Post> posts = postService.queryAllByNormal(0);
        return "post/addPost";
    }


    @RequestMapping(value = "/post.add")
    public String addPost(@ModelAttribute Post post, @ModelAttribute Department department, Model model, HttpSession httpSession) {
        System.out.println(post);
        System.out.println(department);


        if (department == null) {
            model.addAttribute("info", "部门错误");
            return "post/addPost";
        }
        List<Department> departments = departmentService.queryDepartment(department);
        model.addAttribute("departments",departments);
        if (departments == null || departments.isEmpty()) {
            model.addAttribute("info", "部门错误");
            return "post/addPost";
        }
        if (post == null) {
            model.addAttribute("info", "职务为空");
            return "post/addPost";
        }

        Admin admin = (Admin) httpSession.getAttribute("admin");
        if (admin == null) {
            model.addAttribute("info", "管理员登录失效");
            return "post/addPost";
        }
        Integer id = admin.getId();
        post.setAdminId(id);
        post.setDepartmentId(departments.get(0).getId());

        boolean b = postService.addPost(post);
        if (b) {
            model.addAttribute("info", "增加成功");
            return "post/addPost";
        }
        model.addAttribute("info", "增加失败");
        return "post/addPost";

    }

}
