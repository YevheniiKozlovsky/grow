package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarStatusRepository extends JpaRepository<CarStatus, Integer> {
}
