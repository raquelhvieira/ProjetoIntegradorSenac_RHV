
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

    // Método para buscar paciente por CPF
    public Paciente buscarPacientePorCpf(String cpf) {
        return pacienteRepository.findByCpf(cpf);
    }

    // Método para buscar paciente por nome
    public Paciente buscarPacientePorNome(String nome) {
        return pacienteRepository.findByNome(nome);
    }
    
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findById(Long id) {
        return pacienteRepository.findById(id);
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    //VER AINDA
    //public void deleteById(Long id) {
    //    pacienteRepository.deleteById(id);
    //}
    
}
