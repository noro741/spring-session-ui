package com.sessionui.version1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ProfileController {
    @RequestMapping(value = "/")
    public String getProfilePage(HttpServletResponse response){
//        String cacheControl = CacheControl.maxAge(10, TimeUnit.SECONDS).getHeaderValue();
//        response.addHeader("Cache-Control", cacheControl);
        return "admin";
    }
}
