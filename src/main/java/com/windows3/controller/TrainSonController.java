package com.windows3.controller;

import com.windows3.po.Admin;
import com.windows3.po.Emp;
import com.windows3.po.Train;
import com.windows3.po.TrainSon;
import com.windows3.service.TrainService;
import com.windows3.service.TrainSonService;
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
@RequestMapping(value = "/trainSon")
public class TrainSonController {

    @Autowired
    private TrainSonService trainSonService;


    @RequestMapping(value = "/trainSon.add")
    public String addTrain(@ModelAttribute TrainSon trainSon, Model model) {
        System.out.println(trainSon);


        boolean b = trainSonService.addTrainSon(trainSon);
        Train train=new Train();
        train.setId(trainSon.getTrainId());
        if (b){
            model.addAttribute("info","增加成功");
            model.addAttribute("train",train);
            return "trainSon/add";
        }
        model.addAttribute("info","增加失败");
        model.addAttribute("train",train);
        return "trainSon/add";
    }

    @RequestMapping(value = "/trainSon.create")
    public String createTrain(Train train, Model model) {
        model.addAttribute("train", train);
        return "trainSon/add";
    }

    @RequestMapping(value = "/trainSon.queryByTrainId")
    public String queryByTrainId(Train train,Model model) {
        List<TrainSon> trainSonList = trainSonService.queryByTrainId(train);
        model.addAttribute("trainSonList",trainSonList);
        model.addAttribute("train",train);
        return "trainSon/all";
    }

}
