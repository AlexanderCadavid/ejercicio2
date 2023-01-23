package com.example.ejercicio2.services;

import com.example.ejercicio2.dto.ProfesorDTO;

import java.util.List;

public interface IProfesorService {

	void save(ProfesorDTO profesorDTO);

	List<ProfesorDTO> getAll();

	String update(ProfesorDTO profesorDTO);

	boolean delete (Integer cedula);
}
