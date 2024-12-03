package com.easyaudio.pi3_easyaudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EasyAudioController {

    @GetMapping("/") //entre "" é o que vou digitar na url
    public String mostraIndex() {
        return "index"; //entre "" coloco o nome da página que quero, não precisa o .html pq ele reconhece
    }
    
    // para direcionar para pág cadastro pct
    //@GetMapping("/cadastropaciente")
    //public String mostraCadastroPaciente(){
    //    return "cadastroPaciente";    
    //}
    
    // para direcionar para pag cadastro fono
    //@GetMapping("/cadastrofono")
    //public String mostraCadastroFono(){
    //    return "cadastroFono";    
    //}
    
    // para direcionar para pag de audiometria
   // @GetMapping("/audiometria")
   // public String mostraAudiometria(){
    //    return "audiometria";    
    //}
    
    // para direcionar para pag de comparação
    //@GetMapping("/comparacao")
    //public String mostraComparacao(){
    //    return "comparacaoAudio";    
    //}
}
