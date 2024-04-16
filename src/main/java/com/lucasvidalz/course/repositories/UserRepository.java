package com.lucasvidalz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasvidalz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
