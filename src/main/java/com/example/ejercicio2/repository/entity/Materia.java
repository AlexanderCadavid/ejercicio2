package com.example.ejercicio2.repository.entity;

import javax.persistence.*;

@Entity
public class Materia {
    @Id
    public String id;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
