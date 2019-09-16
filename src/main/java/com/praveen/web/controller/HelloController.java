package com.praveen.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class HelloController
{

    @GetMapping({"/","welcome"})
    public String welcome(Map<String, Object> model) {
        model.put("title", new Date());
        model.put("message", "Welcome to Spring Security");
        return "hello";
    }

    @GetMapping("/admin/**")
    public String adminPage(Map<String, Object> model) {
        model.put("title", new Date());
        model.put("message", "Welcome to Protected Page");
        return "admin";
    }
}
