package com.company.TORS;

import java.util.Date;
import java.util.Scanner;

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

    public Reservation() {
    }

    public void createReservation(Tour tour){
        Scanner keys = new Scanner(System.in);
        Scanner confi = new Scanner(System.in);
        char confirmation = 'n';

        String names = "";
        String email= "";

        while(confirmation != 'y'){
            System.out.println("Enter your full name for reservation: ");
            names = keys.nextLine();

            System.out.println("Enter your email: ");
            email = keys.nextLine();

            System.out.println("Full names: " + names);
            System.out.println("Email: " + email);

            System.out.println("Please confirm the information below before approving your reservation: (y for yes)");
            confirmation = confi.next().charAt(0);
        }

        User user = new User(1, names, email);
        Reservation reservation = new Reservation(1, "08/04/2021", user, tour);

        System.out.println("Your reservation has been succesfully created");
        System.out.println(reservation);

        notifyAgency(reservation);


    }

    public void cancelReservaion(){

    }

    public static void notifyAgency(Reservation res){
        System.out.println("Agency has been notified!");
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
