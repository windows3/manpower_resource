package com.windows3.controller;

import com.windows3.po.Customer;
import com.windows3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by 3 on 2018/3/8.
 * ----------------The heart withered--------
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/reg.view")
    public   String   regPage(){
        return "customer/register";
    }

    @RequestMapping(value = "/reg.do")
    public   String    customerRegister(@ModelAttribute Customer customer, HttpSession session, Model model){

        boolean addFlag = customerService.addCustomer(customer);
        if (addFlag){
            model.addAttribute("info","注册成功");
            session.setAttribute("customer",customer);
            return "customer/success";

        }
        model.addAttribute("info","注册失败");
        return  "customer/index";

    }
    @RequestMapping(value = "/login.view")
    public   String  loginPage(){
        return "customer/login";
    }
    @RequestMapping(value = "/login.index")
    public   String  index(){
        return "customer/index";
    }


    @RequestMapping(value = "/login.do")
    public   String  login(@ModelAttribute Customer customer,
                           HttpSession  session, Model model,
            @RequestParam(value = "isremember" ,required = false) String isremember,
            HttpServletResponse response
        ){
        System.out.println("登陆之前"+customer);
        customer = customerService.queryCustomerByName(customer);
        if (customer == null) {
            model.addAttribute("info","登录失败");
            return "customer/index";
        }
        session.setAttribute("customer",customer);
        System.out.println(customer);
//        保存cookie
        System.out.println(isremember);
        if ("on".equals(isremember)){
            Cookie cookieName=new Cookie("customerName",customer.getCustomerName());
            cookieName.setMaxAge(60*60*24*7);
            cookieName.setPath("/");
            Cookie cookiePassword=new Cookie("customerPassword",customer.getCustomerPassword());
            cookiePassword.setMaxAge(60*60*24*1);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
        }

        session.setAttribute("customer",customer);
        model.addAttribute("info","登录成功");

        return "customer/success";
    }
    @RequestMapping("/customer.info")
    public   String   customerInfo(){
        return "customer/success";

    }

}
