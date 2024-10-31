package com.koreait.assignment_24_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsrHomeController {

    @GetMapping("/usr/home/main")
    public String showMain(Model model) {

        return "usr/home/main";
    }
}
