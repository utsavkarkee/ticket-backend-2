package com.ticketbooking.model;

import com.ticketbooking.entity.MovieEntity;



public class Show {
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getMovie() {
        return movieId;
    }

    public void setMovie(int movieId) {
        this.movieId = movieId;
    }

    private String startTime;

    private String endTime;

    private int movieId;
}
