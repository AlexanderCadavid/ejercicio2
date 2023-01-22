package com.example.ejercicio2.controllers;

import com.example.ejercicio2.dto.EstudianteDTO;
import com.example.ejercicio2.services.Imple.EstudianteServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Estudiante")
public class EstudianteController {
	private EstudianteServiceImp estudianteServiceImp;

	public EstudianteController(EstudianteServiceImp estudianteServiceImp){
		this.estudianteServiceImp = estudianteServiceImp;
	}

	@GetMapping()
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(estudianteServiceImp.getAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente mas tarde.\"}");
		}
	}

	public ResponseEntity<?> save(EstudianteDTO estudianteDTO){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(estudianteServiceImp.save(estudianteDTO));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente mas tarde.\"}");
		}

	}
}
