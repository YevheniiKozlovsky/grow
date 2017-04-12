package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
