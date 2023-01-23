package com.example.ejercicio2.dto;

import com.example.ejercicio2.repository.entity.Estudiante;


public class EstudianteDTO {

    private String nombres;
    private String apellidos;
    private int fechaNacimiento;
    private Integer ced;
    private Integer edad;
    private String materia;

    public EstudianteDTO(){

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

    public Integer getCed() {
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

    public EstudianteDTO(Estudiante estudiante){

        this.nombres = estudiante.getNombres();
        this.apellidos = estudiante.getApellidos();
        this.fechaNacimiento = estudiante.getFechaNacimiento();
        this.ced = estudiante.getCed();
        this.edad = estudiante.getEdad();

    }
}

