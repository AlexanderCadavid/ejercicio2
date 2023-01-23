package com.example.ejercicio2.controllers;

import com.example.ejercicio2.dto.ProfesorDTO;
import com.example.ejercicio2.services.Imple.ProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Profesor")
public class ProfesorController {
	private ProfesorService profesorService;

	public ProfesorController(ProfesorService profesorService){
		this.profesorService = profesorService;
	}

	@GetMapping()
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(profesorService.getAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente mas tarde.\"}");
		}
	}

	@PostMapping()
	public ResponseEntity<?>
	save(@RequestBody ProfesorDTO profesor) {
		profesorService.save(profesor);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<?>
	update(@RequestBody ProfesorDTO profesor){
		return new ResponseEntity<>(profesorService.update(profesor), HttpStatus.CREATED);
	}

	@DeleteMapping
	public ResponseEntity<?>
	delete(@RequestBody ProfesorDTO profesor) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(profesorService.delete(profesor.getCedula()));
	}
}
