package com.rubensLourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubensLourenco.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
