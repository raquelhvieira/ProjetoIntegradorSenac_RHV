package com.easyaudio.pi3_easyaudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EasyAudioController {

    @GetMapping("/") //entre "" é o que vou digitar na url
    public String mostraIndex() {
        return "index"; //entre "" coloco o nome da página que quero, não precisa o .html pq ele reconhece
    }
    
    @GetMapping("/cadastropaciente")
    public String mostraCadastroPaciente(){
        return "cadastroPaciente";    
    }
    
    

}
