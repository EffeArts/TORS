package com.company.TORS;

import java.util.Date;

public class Reservation {
    private int id;
    private String date;
    private User user;
    private Tour tour;

    public Reservation(int id, String date, User user, Tour tour) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.tour = tour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public String toString(){
        return "{ Reservation id: " +
                getId() +
                ", Names on the reservation: " +
                user.getNames() +
                ", Date of Reservation: " +
                getDate() +
                ", Tour: " +
                tour.getDescription() +
                ", Tour date: " +
                tour.getDate() +
                ", Tour Destination: " +
                tour.getDestination().getName()
                + "}";
    }
}
