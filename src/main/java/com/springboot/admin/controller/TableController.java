package com.springboot.admin.controller;

import com.springboot.admin.bean.User;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author onlyWjt
 * @date 2022年05月11日 21:12
 * @desc
 */
@Controller()
public class TableController {
    @GetMapping("/basic_table")
    public String basicTable(){
        return "/table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){

        List<User> users = Arrays.asList(new User("张三", "123456"),
                new User("李四", "123456"),
                new User("王际涛", "123456"),
                new User("测试", "123456"));
        model.addAttribute("users",users);
        return "/table/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "/table/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "/table/editable_table";
    }
}
