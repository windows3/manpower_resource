package com.windows3.controller;

import com.windows3.po.Customer;
import com.windows3.po.Resume;
import com.windows3.service.CustomerService;
import com.windows3.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * Created by 3 on 2018/3/8.
 * ----------------The heart withered--------
 */
@Controller
@RequestMapping(value = "/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/resume.index")
    public String resumeInfo(HttpSession httpSession, Model model) {

        Customer customer = (Customer) httpSession.getAttribute("customer");
        System.out.println(customer);
        if (customer == null) {
            System.out.println(customer);
            model.addAttribute("info", "用户登录已失效，请重新登录");
            return "customer/login";
        }
        List<Resume> resumeList = resumeService.queryResumeById(customer);
        if (resumeList == null || resumeList.isEmpty()) {
            model.addAttribute("info", "没有简历,请添加");
            return "resume/add";
        }

        httpSession.setAttribute("resume", resumeList.get(0));
        model.addAttribute("resume", resumeList.get(0));
        return "resume/index";
    }

    @RequestMapping(value = "/resume.update")
    public String updateResume(HttpSession httpSession, Model model) {
        Resume resume = (Resume) httpSession.getAttribute("resume");
        model.addAttribute("resume", resume);
        return "resume/replay";
    }

    @RequestMapping(value = "/resume.updated")
    public String updatedResume(Resume resume, HttpSession httpSession, Model model) {
        Resume resume1 = (Resume) httpSession.getAttribute("resume");
        System.out.println("resume" + resume);
        resume.setId(resume1.getId());
        boolean b = resumeService.updateResume(resume);
        if (b){
            model.addAttribute("info","修改成功");
            return "customer/success";
        }
        model.addAttribute("info","修改失败");
        return "customer/success";

    }


    @RequestMapping(value = "/resume.add")
    public String addResume(HttpSession httpSession, Model model, Resume resume) {
        if (resume == null) {
            model.addAttribute("info", "简历为空,添加失败");
            return "resume/add";
        }
        Customer customer = (Customer) httpSession.getAttribute("customer");
        if (customer == null) {
            System.out.println(customer);
            model.addAttribute("info", "用户登录已失效，请重新登录");
            return "customer/login";
        }
        resume.setCustomerId(customer.getId());
        boolean b = resumeService.addResume(resume);
        if (b) {
            model.addAttribute("info", "保存成功");
            return "resume/add";
        }
        model.addAttribute("info", "保存失败");
        return "resume/index";
    }


}
