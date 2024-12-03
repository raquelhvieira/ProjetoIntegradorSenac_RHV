
package com.easyaudio.pi3_easyaudio.repository;

import com.easyaudio.pi3_easyaudio.model.Paciente;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByCpf(String cpf);
    Paciente findByNome (String nome);
    
}
