package com.example.ejercicio2.services;

import com.example.ejercicio2.dto.EstudianteDTO;
import com.example.ejercicio2.repository.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    void save(EstudianteDTO estudianteDTO);

    List<EstudianteDTO> getAll();

    String update(EstudianteDTO estudianteDTO);

    boolean delete (String id);

    Optional<Estudiante> findById(Integer ced);

}
