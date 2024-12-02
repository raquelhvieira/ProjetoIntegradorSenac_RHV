
package com.easyaudio.pi3_easyaudio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "audiometria")
public class Audiometria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "fonos_id", referencedColumnName = "id")
    private Fono fono;

    @Column(name = "data_exame")
    private Date dataExame;

    @Column(name = "aud_VAD_05")
    private Integer vad05;

    @Column(name = "aud_VAD_1")
    private Integer vad1;

    @Column(name = "aud_VAD_2")
    private Integer vad2;

    @Column(name = "aud_VAD_3")
    private Integer vad3;

    @Column(name = "aud_VAD_4")
    private Integer vad4;

    @Column(name = "aud_VAD_6")
    private Integer vad6;

    @Column(name = "aud_VAD_8")
    private Integer vad8;

    @Column(name = "aud_VAE_05")
    private Integer vae05;

    @Column(name = "aud_VAE_1")
    private Integer vae1;

    @Column(name = "aud_VAE_2")
    private Integer vae2;

    @Column(name = "aud_VAE_3")
    private Integer vae3;

    @Column(name = "aud_VAE_4")
    private Integer vae4;

    @Column(name = "aud_VAE_6")
    private Integer vae6;

    @Column(name = "aud_VAE_8")
    private Integer vae8;
    
}
