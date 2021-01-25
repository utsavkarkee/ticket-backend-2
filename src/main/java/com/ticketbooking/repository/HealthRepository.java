package com.ticketbooking.repository;

import com.ticketbooking.entity.Userssss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends JpaRepository<Userssss, Long> {
    Userssss findByName(String userName);
}
