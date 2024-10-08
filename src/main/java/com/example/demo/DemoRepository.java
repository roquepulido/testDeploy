package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DemoRepository extends JpaRepository<DemoEntity,Integer> {
    
    @Query(value = "SELECT v FROM DemoEntity v WHERE v.id = :id")
    Optional<DemoEntity> getEntidad(@Param("id") int id);
}