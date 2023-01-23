package com.example.ejercicio2.repository.entity;

import com.example.ejercicio2.dto.EstudianteDTO;

import javax.persistence.*;

@Entity
public class Estudiante {

    @Id
    private Integer ced;

    private String nombres;
    private String apellidos;
    private int fechaNacimiento;
    private int edad;
    private String materia;

    public Estudiante() {
    }

    public Estudiante(String nombres, String apellidos, int fechaNacimiento, int ced,int edad, String materia){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.ced = ced;
        this.edad = edad;
        this.materia = materia;
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

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Estudiante (EstudianteDTO estudianteDTO){

        this.nombres = estudianteDTO.getNombres();
        this.apellidos = estudianteDTO.getApellidos();
        this.fechaNacimiento = estudianteDTO.getFechaNacimiento();
        this.ced = estudianteDTO.getCed();


    }
}

