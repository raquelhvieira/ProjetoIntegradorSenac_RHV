
package com.easyaudio.pi3_easyaudio.repository;


import com.easyaudio.pi3_easyaudio.model.Audiometria;
import com.easyaudio.pi3_easyaudio.model.Paciente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AudiometriaRepository extends JpaRepository<Audiometria, Long> {
    List<Audiometria> findByPaciente(Paciente paciente);  // Buscar todas as audiometrias de um paciente
    List<Audiometria> findByPacienteId(Long pacienteId);
   
}