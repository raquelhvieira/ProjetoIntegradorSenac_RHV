
package com.easyaudio.pi3_easyaudio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;


@Data
@Entity
@Table(name = "paciente")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_pct")
    private String nome;

    @Column(name = "dataNasc_pct")
    private Date dataNascimento;

    @Column(name = "cpf_pct")
    private String cpf;
    
}


