package com.rubensLourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubensLourenco.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
