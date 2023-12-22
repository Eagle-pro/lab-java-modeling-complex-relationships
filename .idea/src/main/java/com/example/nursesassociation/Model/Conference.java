package com.example.nursesassociation.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jdk.jfr.Event;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Entity
@DiscriminatorValue("CONFERENCE")
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;
    @Getter
    @Setter
    @Id
    private Long id;

    // Getters and Setters
}

