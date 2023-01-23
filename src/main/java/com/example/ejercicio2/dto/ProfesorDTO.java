package com.example.ejercicio2.dto;

import com.example.ejercicio2.repository.entity.Profesor;

public class ProfesorDTO {

    private String nombres;
    private String apellidos;
    private Integer cedula;
    private Integer edad;
    private String materia;

    public ProfesorDTO(String nombres,String apellidos,Integer ced,String materia,Integer edad){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = ced;
        this.materia = materia;
        this.edad = edad;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ProfesorDTO (Profesor profesor){

       this.nombres = profesor.getNombres();
       this.apellidos = profesor.getApellidos();
       this.cedula = profesor.getCedula();
       this.edad = profesor.getEdad();
       this.materia = profesor.getMateria();

    }
}
