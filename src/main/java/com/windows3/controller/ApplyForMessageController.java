package com.windows3.controller;

import com.windows3.po.ApplyForMessage;
import com.windows3.po.Customer;
import com.windows3.po.RecruitMessage;
import com.windows3.po.Resume;
import com.windows3.service.ApplyForMessageService;
import com.windows3.service.CustomerService;
import com.windows3.service.RecruitMessageService;
import com.windows3.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.net.IDN;
import java.util.List;

/**
 * Created by 3 on 2018/3/22.
 */
@Controller
@RequestMapping(value = "/applyForMessage")
public class ApplyForMessageController {
    @Autowired
    private ApplyForMessageService applyForMessageService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    ResumeService resumeService;
    @Autowired
    private RecruitMessageService recruitMessageService;

    @RequestMapping(value = "/apply.do")
    public String index(@ModelAttribute RecruitMessage recruitMessage, Model model, HttpSession httpSession) {
        List<RecruitMessage> recruitMessageList=  recruitMessageService.queryRecruitByStatus(1,1);
        if (recruitMessageList == null||recruitMessageList.isEmpty()) {
            model.addAttribute("info", "暂时没有发布的招聘信息");
            return "customer/success";
        }
        model.addAttribute("recruitMessageList",recruitMessageList);
        if (recruitMessage == null) {
            model.addAttribute("info", "投递失败");
            return "customer/success";
        }
        List<ApplyForMessage> applyForMessageList = applyForMessageService.queryBySee(0);
        model.addAttribute("applyForMessageList", applyForMessageList);
        Customer customer = (Customer) httpSession.getAttribute("customer");
        System.out.println(customer);
        System.out.println(recruitMessage);
        List<Resume> resumes = resumeService.queryResumeById(customer);
        if (resumes == null || resumes.isEmpty()) {
            model.addAttribute("info", "请先增加简历");
            return "resume/add";
        }
        ApplyForMessage applyForMessage = new ApplyForMessage();
        applyForMessage.setRecruitMessageId(recruitMessage.getId());
        applyForMessage.setResumeId(resumes.get(0).getId());
       ApplyForMessage applyForMessage1= applyForMessageService.queryByResumeIdAndRecruitId(applyForMessage);
        if (applyForMessage1 != null) {
            model.addAttribute("info", "不能重复投递");
            return "recruitMessage/all";
        }
        boolean b = applyForMessageService.addApply(applyForMessage);
        if (b) {
            model.addAttribute("info", "投递成功");
            return "recruitMessage/all";
        }
        model.addAttribute("info", "投递失败");
        return "recruitMessage/all";

    }

    @RequestMapping(value = "/apply.query")
    public String queryAll(Model model, HttpSession httpSession) {

        List<ApplyForMessage> applyForMessageList = applyForMessageService.queryBySee(0);
        if (applyForMessageList == null || applyForMessageList.isEmpty()) {
            model.addAttribute("info", "没有信息");
            return "apply/all";
        }

        model.addAttribute("applyForMessageList", applyForMessageList);
        return "apply/all";
    }

    @RequestMapping(value = "/apply.queryById")
    public String queryById(ApplyForMessage applyForMessage, Model model, HttpSession httpSession) {
        System.out.println(applyForMessage);
        applyForMessage = applyForMessageService.queryById(applyForMessage);
        System.out.println(applyForMessage);
        model.addAttribute("resume",applyForMessage.getResume());
        return "resume/info";
    }
}
