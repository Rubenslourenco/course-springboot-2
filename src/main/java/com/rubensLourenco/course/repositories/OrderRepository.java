package com.rubensLourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubensLourenco.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
