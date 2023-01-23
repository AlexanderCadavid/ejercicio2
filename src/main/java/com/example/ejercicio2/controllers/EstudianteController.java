package com.example.ejercicio2.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.ejercicio2.dto.EstudianteDTO;
import com.example.ejercicio2.services.IEstudianteService;
import com.example.ejercicio2.services.Imple.EstudianteServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.accessibility.AccessibleEditableText;
import javax.persistence.Id;

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

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer ced) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(estudianteServiceImp.findById(ced));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente mas tarde.\"}");
		}
	}
	@PostMapping()
	public ResponseEntity<?>
	save(@RequestBody EstudianteDTO estudiante) {
		estudianteServiceImp.save(estudiante);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<?>
	update(@RequestBody EstudianteDTO estudiante){
		return new ResponseEntity<>( estudianteServiceImp.update(estudiante), HttpStatus.CREATED);
	}

	@DeleteMapping
	public ResponseEntity<?>
	delete(@RequestBody EstudianteDTO estudianteDTO) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(estudianteServiceImp.delete(String.valueOf(estudianteDTO.getCed())));
	}
}

