package com.example.ejercicio2.dto;

public class MateriaDTO {

    private int horario;
    private String tema;

    public MateriaDTO(int horario,String tema){
        this.horario = horario;
        this.tema = tema;
    }
    public MateriaDTO(){

    }
    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
