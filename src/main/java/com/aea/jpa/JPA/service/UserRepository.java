package com.aea.jpa.JPA.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aea.jpa.JPA.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
