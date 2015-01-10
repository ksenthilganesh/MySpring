package com.bn.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bn.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
