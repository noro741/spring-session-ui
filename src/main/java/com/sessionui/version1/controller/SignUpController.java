package com.sessionui.version1.controller;


import com.sessionui.version1.dto.SignUpUserDTO;
import com.sessionui.version1.service.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class SignUpController {

    @Autowired
    SignUpServiceImpl signUpService;

    @PostMapping(value = "/signup")
    public ResponseEntity signUp(@RequestBody SignUpUserDTO signUpUserDTO){
        try {
            signUpService.signUp(signUpUserDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();

    }
    @GetMapping(value = "/signup")
    public String signUp(){

        return "signup";
    }
}
