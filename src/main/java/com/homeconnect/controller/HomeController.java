package com.homeconnect.controller;

import com.homeconnect.model.HomePageResponse;
import com.homeconnect.model.User;
import com.homeconnect.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @PostMapping(value = "/home",  consumes = "application/json", produces = "application/json")
    public HomePageResponse homepage(User user){
        HomePageResponse homePageResponse = homeService.getHomePage(user.getUserid());
        return homePageResponse;
    }

}
