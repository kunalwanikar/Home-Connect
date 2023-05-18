package com.homeconnect.service;

import com.homeconnect.model.HomePageResponse;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public HomePageResponse getHomePage(long userId){
        return new HomePageResponse();
    }

}
