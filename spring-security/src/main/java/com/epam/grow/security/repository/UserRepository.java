package com.epam.grow.security.repository;

import com.epam.grow.security.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    UserModel findByLogin(String login);
    // just extended implementation
    // read jpa documentation

}
