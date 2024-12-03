
package com.easyaudio.pi3_easyaudio.service;

import com.easyaudio.pi3_easyaudio.model.Fono;
import com.easyaudio.pi3_easyaudio.repository.FonoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FonoService {
    @Autowired
    private FonoRepository fonoRepository;

    public List<Fono> findAll() {
        return fonoRepository.findAll();
    }

    public Optional<Fono> findById(Long id) {
        return fonoRepository.findById(id);
    }

    public Fono save(Fono fono) {
        return fonoRepository.save(fono);
    }

    //VER AINDA
    //public void deleteById(Long id) {
    //    fonoRepository.deleteById(id);
    //}
    
}
