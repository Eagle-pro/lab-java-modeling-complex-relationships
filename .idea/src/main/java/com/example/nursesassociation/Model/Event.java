package com.example.nursesassociation.Model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type")
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate date;

    private int duration; // duration in hours

    private String location;

    @NotNull
    private String title;

    @ManyToMany
    @JoinTable(
            name = "event_guests",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private List<Guest> guests = new ArrayList<>();

    // Getters and Setters

    public <Guest> void addGuest(Guest guest) {
        if (!guests.contains(guest)) {
            guests.add((com.example.nursesassociation.Model.Guest) guest);
        }
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", date=" + date +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public abstract String getDescription();
}

