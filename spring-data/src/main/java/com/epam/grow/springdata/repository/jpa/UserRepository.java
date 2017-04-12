package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
