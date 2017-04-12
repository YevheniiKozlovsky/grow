package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
