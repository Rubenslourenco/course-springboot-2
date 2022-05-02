package com.rubensLourenco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubensLourenco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
