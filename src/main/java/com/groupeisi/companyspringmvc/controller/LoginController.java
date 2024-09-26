package com.groupeisi.companyspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping(name = "index", value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(name = "logout", value = "/logout")
    public String logout() {
        return "redirect:/";
    }
}
