package com.radagon.gestioneventos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Event {
    private @Id @GeneratedValue Long id;
    private String name;
    private String date;
    private String openingTime;
    private String startTime;
    private String place;
    private String address;
    private String city;
    private int capacity;
    // private String artists;
    // private String people;
    private String status;
    private int currentCapacity;
    private double price;

    public Event(Long id, String name, String date, String openingTime, String startTime, String place, String address,
                 String city, int capacity, String status, int currentCapacity, double price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.openingTime = openingTime;
        this.startTime = startTime;
        this.place = place;
        this.address = address;
        this.city = city;
        this.capacity = capacity;
        this.status = status;
        this.currentCapacity = currentCapacity;
        this.price = price;
    }

    public Event() {
    }
}
