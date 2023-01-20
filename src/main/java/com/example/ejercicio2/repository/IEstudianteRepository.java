package com.example.ejercicio2.repository;

import com.example.ejercicio2.repository.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface IEstudianteRepository extends CrudRepository<Estudiante,Integer> {
}
