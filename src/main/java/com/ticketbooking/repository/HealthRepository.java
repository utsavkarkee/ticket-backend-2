package com.ticketbooking.repository;

import com.ticketbooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends JpaRepository<User, Long> {
    User findByName(String userName);
}
