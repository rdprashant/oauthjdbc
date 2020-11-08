package com.spring.security.oauthjdbc.repository;

import com.spring.security.oauthjdbc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Prashant on 26/09/2019.
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String name);
}
