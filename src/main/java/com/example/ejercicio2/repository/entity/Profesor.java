package com.example.ejercicio2.repository.entity;

import com.example.ejercicio2.dto.ProfesorDTO;

import javax.persistence.*;


@Entity
public class Profesor {

    @Id
    private Integer cedula;

    private String nombres;
    private String apellidos;
    private Integer edad;
    private String materia;


    public Profesor(Integer cedula) {
        this.cedula = cedula;
    }

    public Profesor() {
    }

    public Profesor(String nombres, String apellidos, Integer edad, String materia,Integer cedula){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.materia = materia;
        this.cedula = cedula;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Profesor(ProfesorDTO profesorDTO){

        this.nombres = profesorDTO.getNombres();
        this.apellidos = profesorDTO.getApellidos();
        this.materia = profesorDTO.getMateria();
        this.edad = profesorDTO.getEdad();
        this.cedula=profesorDTO.getCedula();

    }

}

