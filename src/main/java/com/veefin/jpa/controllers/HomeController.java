package com.veefin.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
public class HomeController {
    @RequestMapping("home")
    public String home() {
        System.out.println("Hi");
        return "index.jsp";
    }
}
