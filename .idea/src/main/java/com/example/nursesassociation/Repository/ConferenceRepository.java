package com.example.nursesassociation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository<Conference> extends JpaRepository<Conference, Long> {
}
