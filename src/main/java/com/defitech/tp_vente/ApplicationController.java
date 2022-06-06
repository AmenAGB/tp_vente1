package com.defitech.tp_vente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/home")
    public String getHome(){
        return "admin/index";
    }
    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }
    @GetMapping("/logout")
    public String logout(){
        return "admin/login";
    }
    @GetMapping("/register")
    public String registr(){
        return "admin/register";
    }

}
