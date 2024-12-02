
package com.easyaudio.pi3_easyaudio.service;

import com.easyaudio.pi3_easyaudio.model.Audiometria;
import com.easyaudio.pi3_easyaudio.model.Paciente;
import com.easyaudio.pi3_easyaudio.repository.AudiometriaRepository;
import com.easyaudio.pi3_easyaudio.repository.PacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComparacaoService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private AudiometriaRepository audiometriaRepository;

    public List<Audiometria> buscarAudiometriasPorCpf(String cpf) {
        Paciente paciente = pacienteRepository.findByCpf(cpf);
        if (paciente != null) {
            return audiometriaRepository.findByPaciente(paciente);
        }
        return null;  // Paciente não encontrado
    }
}