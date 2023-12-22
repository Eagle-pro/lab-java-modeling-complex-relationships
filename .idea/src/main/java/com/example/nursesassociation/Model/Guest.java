package com.example.nursesassociation.Model;

import jakarta.persistence.*;


@Entity
public class Guest {

    public enum Response {
        ATTENDING, NOT_ATTENDING, NO_RESPONSE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Response response;

    // Getters and Setters
}

