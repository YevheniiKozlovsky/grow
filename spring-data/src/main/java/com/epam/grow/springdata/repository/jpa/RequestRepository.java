package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository  extends JpaRepository<Request, Integer> {
}
