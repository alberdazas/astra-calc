package com.astra.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("date", new Date());
        return "hello";
    }
}
