
package com.easyaudio.pi3_easyaudio.service;

import com.easyaudio.pi3_easyaudio.model.Audiometria;
import com.easyaudio.pi3_easyaudio.repository.AudiometriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AudiometriaService {
    
    @Autowired
    private AudiometriaRepository audiometriaRepository;

    // Método para buscar audiometrias de um paciente
    public List<Audiometria> buscarAudiometriasPorPaciente(Long pacienteId) {
        return audiometriaRepository.findByPacienteId(pacienteId);
    }
    
    public List<Audiometria> findAll() {
        return audiometriaRepository.findAll();
    }

    public Optional<Audiometria> findById(Long id) {
        return audiometriaRepository.findById(id);
    }

    public Audiometria save(Audiometria audiometria) {
        return audiometriaRepository.save(audiometria);
    }

    //VER AINDA
    //public void deleteById(Long id) {
    //    audiometriaRepository.deleteById(id);
    //}
    
}
