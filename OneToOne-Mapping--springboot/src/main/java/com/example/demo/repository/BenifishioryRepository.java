package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Benifishiory;

@Repository
public interface BenifishioryRepository extends JpaRepository<Benifishiory, Long> {

}
