
package com.easyaudio.pi3_easyaudio.repository;


import com.easyaudio.pi3_easyaudio.model.Audiometria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiometriaRepository extends JpaRepository<Audiometria, Long> {
   
}