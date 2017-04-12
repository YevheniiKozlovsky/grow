package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
