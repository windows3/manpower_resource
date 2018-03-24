package com.windows3.controller;

import com.windows3.po.Admin;
import com.windows3.po.Train;
import com.windows3.service.AdminService;
import com.windows3.service.TrainService;
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
@RequestMapping(value = "/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @RequestMapping(value = "/train.index")
    public String login() {

        return "train/index";
    }

    @RequestMapping(value = "/train.create")
    public String createTrain() {

        return "train/add";
    }

    @RequestMapping(value = "/train.add")
    public String addTrain(Train train, Model model, HttpSession HttpSession) {
        System.out.println(train);
        if (train == null) {
            model.addAttribute("info", "增加失败");
            return "train/add";
        }
        Admin admin = (Admin) HttpSession.getAttribute("admin");
        if (admin == null) {
            model.addAttribute("info", "登录失效");
            return "admin/login";
        }
        train.setAdminId(admin.getId());
        train.setTrainTime(train.getTrainTime() + "早九点");
        boolean b = trainService.addTrain(train);
        if (b) {
            model.addAttribute("info", "增加成功");
            return "train/add";
        }
        model.addAttribute("info", "增加失败");
        return "train/add";
    }


    @RequestMapping(value = "/train.all")
    public String allTrain(Model model) {
        List<Train> trainList = trainService.queryAll();
        if (trainList == null||trainList.isEmpty()) {
            model.addAttribute("info","没有培训信息,请添加");
            return "train/add";
        }
        model.addAttribute("trainList",trainList);
        return "train/all";
    }
 @RequestMapping(value = "/train.queryById")
    public String queryById(Train train,Model model) {

     System.out.println("成功");
     System.out.println(train);
        return "train/all";
    }


}
