package com.windows3.controller;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.windows3.po.Admin;
import com.windows3.po.Post;
import com.windows3.po.RecruitMessage;

import com.windows3.service.PostService;
import com.windows3.service.RecruitMessageService;
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
    public String release(@ModelAttribute RecruitMessage recruitMessage,Model model) {
        System.out.println(recruitMessage);
        if (recruitMessage == null) {
            model.addAttribute("info", "没有未发布招聘信息，请增加");
            return "recruitMessage/add";
        }
        recruitMessage.setRecruitIsRelease(1);
      boolean b= recruitMessageService.updateRecruitMessage(recruitMessage);

        if(b){

            List<RecruitMessage> recruitMessageList=  recruitMessageService.queryRecruitByStatus(0);
            if (recruitMessageList == null||recruitMessageList.isEmpty()) {
                model.addAttribute("info", "没有未发布招聘信息，请增加");
                return "recruitMessage/add";
            }
            model.addAttribute("recruitMessageList",recruitMessageList);
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
      List<RecruitMessage> recruitMessageList=  recruitMessageService.queryRecruitByStatus(0);
        if (recruitMessageList == null||recruitMessageList.isEmpty()) {
            model.addAttribute("info", "没有未发布招聘信息，请增加");
            return "recruitMessage/add";
        }
        model.addAttribute("recruitMessageList",recruitMessageList);
        return "recruitMessage/recruitMessage";
    }

    @RequestMapping(value = "/query.allEd")
    public String allEd(Model model) {
//        未发布
        List<RecruitMessage> recruitMessageList=  recruitMessageService.queryRecruitByStatus(1);
        if (recruitMessageList == null||recruitMessageList.isEmpty()) {
            model.addAttribute("info", "没有已发布招聘信息，请发布");
            return "recruitMessage/recruitMessage";
        }
        model.addAttribute("recruitMessageList",recruitMessageList);
        return "recruitMessage/rec";
    }

}
