package com.ticketbooking.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class HealthController {

    @GetMapping(value="/hello")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
