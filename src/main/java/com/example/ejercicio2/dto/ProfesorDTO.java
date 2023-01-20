package com.example.ejercicio2.dto;

public class ProfesorDTO {
    private String nombres;
    private String apellidos;
    private int cedula;
    private String materia;

    public ProfesorDTO(String nombres,String apellidos,int ced,String materia){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = ced;
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
}
