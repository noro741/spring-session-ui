package com.sessionui.version1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ProfileController {
    @RequestMapping(value = "/")
    public String getProfilePage(HttpServletRequest req){

        return req.getHeaders("username").toString();
    }
}
