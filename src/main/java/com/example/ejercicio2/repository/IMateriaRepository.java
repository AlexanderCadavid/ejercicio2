package com.example.ejercicio2.repository;

import com.example.ejercicio2.repository.entity.Materia;
import org.springframework.data.repository.CrudRepository;

public interface IMateriaRepository extends CrudRepository<Materia,Integer> {
}
