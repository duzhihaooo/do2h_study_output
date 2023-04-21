package com.dodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//在templates目录下的所有页面，只有通过controller来跳转
//这个需要模版引擎的支持！thymeleaf

@Controller
public class HelloController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg", "hello springboot");
        return "test";
    }
}