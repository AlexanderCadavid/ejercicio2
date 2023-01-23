package com.example.ejercicio2.services.Imple;

import com.example.ejercicio2.dto.ProfesorDTO;
import com.example.ejercicio2.repository.IProfesorRepository;
import com.example.ejercicio2.repository.entity.Profesor;
import com.example.ejercicio2.services.IProfesorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfesorService implements IProfesorService {
	private IProfesorRepository repository;

	public ProfesorService(IProfesorRepository repository){
		this.repository = repository;
	}

	@Override
	public void save(ProfesorDTO profesorDTO) {
		if (!repository.existsById(Integer.valueOf(profesorDTO.getCedula()))) {
			repository.save(new Profesor(profesorDTO));
		}
	}

	@Override
	public List<ProfesorDTO> getAll() {
		List<Profesor> list = (List<Profesor>) repository.findAll();
		return list.stream()
				.map(ProfesorDTO::new)
				.collect(Collectors.toList());
	}

	@Override
	public String update(ProfesorDTO profesorDTO) {
		Optional<Profesor> value = repository.findById(profesorDTO.getCedula());
		if (value.isPresent()) {
			repository.save(new Profesor(profesorDTO));
			return "Actualizado";
		} else {
			return "No existe";

		}
	}

	@Override
	public boolean delete(Integer cedula) {
		if (repository.existsById(cedula)){
			repository.deleteById(cedula);
			return true;
		} else {
			return false;
		}
	}
}
