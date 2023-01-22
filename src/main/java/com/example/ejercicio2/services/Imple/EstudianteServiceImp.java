package com.example.ejercicio2.services.Imple;

import com.example.ejercicio2.dto.EstudianteDTO;
import com.example.ejercicio2.repository.IEstudianteRepository;
import com.example.ejercicio2.repository.entity.Estudiante;
import com.example.ejercicio2.services.IEstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EstudianteServiceImp implements IEstudianteService {
    private IEstudianteRepository repository;

    public EstudianteServiceImp(IEstudianteRepository repository){
        this.repository = repository;
    }

    @Override
    public void save(Estudiante estudiante) {
        if (!repository.existsById(estudiante.getCed())) {
            repository.save(new Estudiante());
        }
    }


    @Override
    public void save(EstudianteDTO estudianteDTO) {
        if (!repository.existsById(estudianteDTO.getCed())) {
            repository.save(new Estudiante());
        }
    }

    @Override
    public List<EstudianteDTO> getAll() {
        List<Estudiante> list = (List<Estudiante>) repository.findAll();
        return list.stream()
                .map(EstudianteDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void update(EstudianteDTO estudianteDTO) {

        Optional<Estudiante> value = repository.findById(estudianteDTO.getCed());
        if (value.isPresent()) {
            repository.save(new Estudiante(estudianteDTO));
            return;
        } else {
            return;

        }
    }

    @Override
    public boolean delete(String id) {
        if (repository.existsById(Integer.valueOf(id))) {
            repository.deleteById(Integer.valueOf(id));
            return true;
        } else {
            return false;
        }
    }
}


