package com.drugs.drugs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellController {

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

}
