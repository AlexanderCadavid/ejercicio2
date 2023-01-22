package com.example.ejercicio2.repository;

import com.example.ejercicio2.repository.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer> {
}
