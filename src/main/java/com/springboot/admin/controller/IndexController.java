package com.springboot.admin.controller;

import com.springboot.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author onlyWjt
 * @date 2022年05月03日 17:38
 * @desc
 */
@Controller
public class IndexController {
    /**
     * 来登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && StringUtils.hasLength(user.getPassWord())){
            session.setAttribute("loginUser", user);
            //重定向提交，防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误，请注意!");
            return "login";
        }

    }
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
        //判断是否登录
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            return "main";
        }else {
            model.addAttribute("msg","请重新登录");
            return "login";
        }

    }
}
