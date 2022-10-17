package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
