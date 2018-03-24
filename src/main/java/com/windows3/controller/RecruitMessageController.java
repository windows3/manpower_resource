package com.windows3.controller;


import com.windows3.po.*;

import com.windows3.service.PostService;
import com.windows3.service.RecruitMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 3 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/recruitMessage")
public class RecruitMessageController {

    @Autowired
    private RecruitMessageService recruitMessageService;

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/recruit.index")
    public String index() {

        return "recruitMessage/index";
    }

    @RequestMapping(value = "/release.do")
    public String release(@ModelAttribute RecruitMessage recruitMessage, Model model) {
        System.out.println(recruitMessage);
        if (recruitMessage == null) {
            model.addAttribute("info", "没有未发布招聘信息，请增加");
            return "recruitMessage/add";
        }
        recruitMessage.setRecruitIsRelease(1);
        boolean b = recruitMessageService.updateRecruitMessage(recruitMessage);

        if (b) {

            List<RecruitMessage> recruitMessageList = recruitMessageService.queryRecruitByStatus(0, 1);
            if (recruitMessageList == null || recruitMessageList.isEmpty()) {
                model.addAttribute("info", "没有未发布招聘信息，请增加");
                return "recruitMessage/add";
            }
            model.addAttribute("recruitMessageList", recruitMessageList);
            return "recruitMessage/recruitMessage";
        }
        model.addAttribute("info", "发布失败");
        return "recruitMessage/recruitMessage";
    }

    @RequestMapping(value = "/recruit.create")
    public String recruitCreate() {

        return "recruitMessage/add";
    }

    @RequestMapping(value = "/recruit.add")
    public String add(@ModelAttribute RecruitMessage recruitMessage, @ModelAttribute Post post, Model model, HttpSession httpSession) {
        System.out.println(recruitMessage);
        System.out.println(post);

        if (recruitMessage == null) {
            model.addAttribute("info", "招聘信息不能为空");
            return "recruitMessage/add";
        }
        if (post == null) {
            model.addAttribute("info", "职位不能为空");
            return "recruitMessage/add";
        }
        List<Post> posts = postService.queryPostByName(post);
        System.out.println(posts);
        if (posts == null || posts.isEmpty()) {
            model.addAttribute("info", "没有此职位");
            return "recruitMessage/add";
        }
        recruitMessage.setPostId(posts.get(0).getId());
        Admin admin = (Admin) httpSession.getAttribute("admin");
        if (admin == null) {
            model.addAttribute("info", "管理员登录失效");
            return "admin/login";
        }
        recruitMessage.setAdminId(admin.getId());
        boolean b = recruitMessageService.addRecruitMessage(recruitMessage);
        if (b) {
            model.addAttribute("info", "增加成功");
            return "recruitMessage/add";
        }
        model.addAttribute("info", "没有此职位");
        return "recruitMessage/add";
    }

    @RequestMapping(value = "/query.allIng")
    public String allIng(Model model) {
//        未发布

        List<RecruitMessage> recruitMessageList = recruitMessageService.queryRecruitByStatus(0, 1);
        if (recruitMessageList == null || recruitMessageList.isEmpty()) {
            model.addAttribute("info", "没有未发布招聘信息，请增加");
            return "recruitMessage/add";
        }
        model.addAttribute("recruitMessageList", recruitMessageList);
        return "recruitMessage/recruitMessage";
    }

    @RequestMapping(value = "/query.allEd")
    public String allEd(Model model) {
//        已发布
        List<RecruitMessage> recruitMessageList = recruitMessageService.queryRecruitByStatus(1, 1);
        if (recruitMessageList == null || recruitMessageList.isEmpty()) {
            model.addAttribute("info", "没有已发布招聘信息，请发布");
            return "recruitMessage/recruitMessage";
        }
        model.addAttribute("recruitMessageList", recruitMessageList);
        return "recruitMessage/rec";
    }

    @RequestMapping(value = "/query.all")
    public String all(Customer util, Model model,HttpSession session) {
        System.out.println(util);
        try {
            util.getId();
            util.setId(util.getId() + 1);
        } catch (NullPointerException e) {
            util.setId(1);
        }
        System.out.println(util);
        List<RecruitMessage> recruitMessageList = recruitMessageService.queryRecruitByStatus(1, util.getId());
        if (recruitMessageList == null || recruitMessageList.isEmpty()) {
            util = new Customer();
            model.addAttribute("util", util);
            List<RecruitMessage> recruitMessageList1 = (List<RecruitMessage>) session.getAttribute("recruitMessageList");
            model.addAttribute("recruitMessageList", recruitMessageList1);
            model.addAttribute("info", "暂时没有其他发布的招聘信息");
            return "recruitMessage/all";
        }
//        未发布
        model.addAttribute("util", util);
        model.addAttribute("recruitMessageList", recruitMessageList);
        session.setAttribute("recruitMessageList",recruitMessageList);
        return "recruitMessage/all";
    }

}
