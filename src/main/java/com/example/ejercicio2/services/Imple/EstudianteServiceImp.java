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
public class EstudianteServiceImp implements IEstudianteService{

    private IEstudianteRepository repository;

    public EstudianteServiceImp(IEstudianteRepository repository){
        this.repository = repository;
    }

    @Override
    public void save(EstudianteDTO estudianteDTO) {
        if (!repository.existsById(Integer.valueOf(estudianteDTO.getCed()))) {
            repository.save(new Estudiante(estudianteDTO));
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
    public String update(EstudianteDTO estudianteDTO) {

        Optional<Estudiante> value = repository.findById(estudianteDTO.getCed());
        if (value.isPresent()) {
            repository.save(new Estudiante(estudianteDTO));
            return "Actualizado";
        } else {
            return "No existe";

        }
    }

    @Override
    public boolean delete(Integer ced) {
        if (repository.existsById(ced)){
            repository.deleteById(ced);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Optional<Estudiante> findById(Integer ced) {
        return repository.findById(ced);
    }

}


