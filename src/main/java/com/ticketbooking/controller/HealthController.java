package com.ticketbooking.controller;


import com.ticketbooking.entity.Userssss;
import com.ticketbooking.repository.HealthRepository;
import com.ticketbooking.repository.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class HealthController {

    @Autowired
    HealthRepository healthRepository;

    @Autowired
    Services services;


    @PostMapping(value="/hello/{name}")
    public ResponseEntity<Userssss> getHello(){
        Userssss userssss1 = new Userssss();
        userssss1.setName("Shailesh");
        userssss1.setAge(15);
        return new ResponseEntity<>(healthRepository.save(userssss1), HttpStatus.OK);
    }

    @GetMapping(value="/hello")
    public ResponseEntity<Userssss> getHello1(){
        return new ResponseEntity<>(healthRepository.findByName("Shailesh"), HttpStatus.OK);
    }
//    @GetMapping(value="/hello")
//    public ResponseEntity<String> getHello1(){
//        services.sayHi();
//        return new ResponseEntity<>("Hi", HttpStatus.OK);
//    }
}
