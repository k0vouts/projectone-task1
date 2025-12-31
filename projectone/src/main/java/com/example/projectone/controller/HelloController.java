package com.example.projectone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula!!";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", " Hello Vistula ");
        return "greeting";
    }
}


