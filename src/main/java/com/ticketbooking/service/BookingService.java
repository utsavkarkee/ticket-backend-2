package com.ticketbooking.service;


import com.ticketbooking.entity.ShowEntity;
import com.ticketbooking.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class BookingService {

    @Autowired
    ShowRepository showRepository;

    public List<ShowEntity> getAllShows(){
        return showRepository.findAll();
    }
}
