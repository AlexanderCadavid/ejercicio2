package com.example.ejercicio2.repository.entity;

import javax.persistence.*;

@Entity
public class Materia {
    @Id
    private String id;
    @Column(name = "id", nullable = false)


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
