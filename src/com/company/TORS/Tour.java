package com.company.TORS;

import java.util.Date;
import java.util.List;

public class Tour {
    private int id;
    private String date;
    private String description;
    private Destination destination;

    public Tour(int id, String date, String description, Destination destination) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.destination = destination;
    }

    public Tour(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public String toString(){
        return "[ tourId: " + id + ", Date: " + date + " , Description: " + description + " , Destination: " +  destination.getName() + "]";
    }

}
