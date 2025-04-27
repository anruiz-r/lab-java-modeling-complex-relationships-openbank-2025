package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Conference extends Event {
    @OneToMany
    private List<Speaker> speakerList;

    public Conference() {
    }

    public Conference(long id, Date date, int duration, String location, String title, List<Guest> guestsList, List<Speaker> speakerList) {
        super(id, date, duration, location, title, guestsList);
        this.speakerList = speakerList;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "speakerList=" + speakerList +
                '}';
    }
}
