package com.company.TORS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static List<Tour> tours = new ArrayList<Tour>();
    private static List<Destination> destinations = new ArrayList<Destination>();

    public static void home(){
        System.out.println("Welcome to TORS!!");
        System.out.println("Press 1 to request all available tours on TORS!");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();

        while(input != 1){
            System.out.println("Wrong Input, Try again");
            input = console.nextInt();
        }
        for(Tour t: getAllTours()){
            System.out.println(t);
        }

        System.out.println("Select The Tour you want to reserve by id");
        int tourSelection = console.nextInt();

        System.out.println("You've selected the tour below:");
        Tour selectedTour = select(tourSelection);
        System.out.println();

        makeReservation(selectedTour);

    }

    public static List<Tour> getAllTours(){
        dataFaker();
        return tours;
    }

    public static void dataFaker(){
        // destinations from Fake DB
        Destination dest1 = new Destination(1, "Ankara");
        Destination dest2 = new Destination(2, "Instabul");
        Destination dest3 = new Destination(3, "Helsinki");

        destinations.add(dest1);
        destinations.add(dest2);
        destinations.add(dest3);

        // Tours from Fake DB
        Tour tour1 = new Tour(0, "20/10/2021", "Tour 1", dest2);
        Tour tour2 = new Tour(1, "09/09/2021", "Tour 2", dest2);
        Tour tour3 = new Tour(2, "02/08/2022", "Tour 3", dest3);
        Tour tour4 = new Tour(3, "01/11/2021", "Tour 4", dest1);
        Tour tour5 = new Tour(4, "05/09/2021", "Tour 5", dest3);

        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(tour4);
        tours.add(tour5);


    }

    public static Tour select(int index){
        Tour selectedTour = tours.get(index);
        return selectedTour;
    }

    public static void makeReservation(Tour tour){
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

    public static void notifyAgency(Reservation res){
        System.out.println("Agency has been notified!");
    }
}
