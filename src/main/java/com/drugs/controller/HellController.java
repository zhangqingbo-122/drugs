package com.drugs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellController {

    @RequestMapping("/")
    public String hello() {
        System.out.println("1111");
        System.out.println("222");
        System.out.println("5555555");
        System.out.println("555555iifhf5");

        return "index";
    }


}
