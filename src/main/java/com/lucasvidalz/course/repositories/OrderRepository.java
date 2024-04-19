package com.lucasvidalz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasvidalz.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
