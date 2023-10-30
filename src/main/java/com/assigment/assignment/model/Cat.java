package com.assigment.assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Cat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    @Id
    private int id;
    private String name;
    public Cat(String name){
        this.name = name;
    }
}
