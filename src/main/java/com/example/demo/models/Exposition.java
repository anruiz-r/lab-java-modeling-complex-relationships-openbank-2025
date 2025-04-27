package com.example.demo.models;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Exposition extends Event{

    public Exposition(long id, Date date, int duration, String location, String title, List<Guest> guestsList) {
        super(id, date, duration, location, title, guestsList);
    }

    public Exposition() {
    }

}
