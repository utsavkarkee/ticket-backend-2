package com.ticketbooking.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movieId")
    private int movieId;

    @Column(name="title")
    private String title;

    @Column(name="duration")
    private int duration;

    @Column(name="genre")
    private String genre;

    public MovieEntity(String title, int duration, String genre){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }
}
