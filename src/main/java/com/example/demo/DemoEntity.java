package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "test")
@Getter
@Setter
public class DemoEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "dato")
    private String dato;
    
}
