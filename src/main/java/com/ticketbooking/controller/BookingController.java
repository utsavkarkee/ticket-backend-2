package com.ticketbooking.controller;


import com.ticketbooking.entity.ShowEntity;
import com.ticketbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;


@Controller("/booking")
public class BookingController {


    @Autowired
    BookingService bookingService;

    @GetMapping(value="all_shows")
    public ResponseEntity<List<ShowEntity>> getAllShows(){
        return new ResponseEntity<List<ShowEntity>>(bookingService.getAllShows(), HttpStatus.OK);
    }


}
