

// aqui vou colocar os gets e stes que tinha antes, 
//mas com o lombok não preciso escrever tudo, posso fazer bem mais resumido
// abaixo vou escrever o que o professor fez na aula do dia 08/10/2024, +- 53min

package com.easyaudio.pi3_easyaudio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class teste {
    private Integer id;
    private String nome;
    private double peso;
    private boolean status;
    
}
