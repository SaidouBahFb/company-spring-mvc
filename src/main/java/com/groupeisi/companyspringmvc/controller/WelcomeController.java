package com.groupeisi.companyspringmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(name = "welcome", value = "/welcome")
    public String welcome() {return "welcome";}
}
