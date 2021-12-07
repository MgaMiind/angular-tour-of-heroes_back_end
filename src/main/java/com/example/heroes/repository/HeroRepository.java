package com.example.heroes.repository;

import com.example.heroes.Entity.Hero;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero,Integer> {
    
}
