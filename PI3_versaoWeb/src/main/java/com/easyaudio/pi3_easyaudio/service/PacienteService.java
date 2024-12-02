
package com.easyaudio.pi3_easyaudio.service;

import com.easyaudio.pi3_easyaudio.model.Paciente;
import com.easyaudio.pi3_easyaudio.repository.PacienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findById(Long id) {
        return pacienteRepository.findById(id);
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void deleteById(Long id) {
        pacienteRepository.deleteById(id);
    }
    
}
