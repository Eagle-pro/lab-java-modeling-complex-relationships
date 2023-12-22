package com.example.nursesassociation.Model;

import com.example.nursesassociation.Model.Conference;
import jakarta.persistence.*;


@Entity
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int presentationDuration; // Duration in minutes

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    // Getters and Setters
}
