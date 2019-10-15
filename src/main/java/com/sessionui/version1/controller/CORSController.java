package com.sessionui.version1.controller;


import com.sessionui.version1.dto.SignUpUserDTO;
import com.sessionui.version1.service.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class CORSController {
   @RequestMapping(value = "/login", method = RequestMethod.OPTIONS)
    public ResponseEntity signUp(){
        return ResponseEntity.ok().build();
    }
}
