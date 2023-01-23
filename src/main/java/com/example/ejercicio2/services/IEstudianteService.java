package com.example.ejercicio2.services;

import com.example.ejercicio2.dto.EstudianteDTO;

import java.util.List;

public interface IEstudianteService {

    void save(EstudianteDTO estudianteDTO);

    List<EstudianteDTO> getAll();

    String update(EstudianteDTO estudianteDTO);

    boolean delete (String id);

}
