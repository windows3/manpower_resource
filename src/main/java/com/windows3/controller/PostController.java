package com.windows3.controller;

import com.windows3.po.Admin;
import com.windows3.service.AdminService;
import com.windows3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 3 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/post")
public class PostController {
    @Autowired
    private PostService postService;


}
