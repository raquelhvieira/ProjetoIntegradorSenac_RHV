
package com.easyaudio.pi3_easyaudio.controller;

import com.easyaudio.pi3_easyaudio.model.Audiometria;
import com.easyaudio.pi3_easyaudio.service.ComparacaoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComparacaoController {

    @GetMapping("/comparacao")
    public String mostraComparacao() {
        return "comparacaoAudio";  
    }
    
    @Autowired
    private ComparacaoService comparacaoService;

    @GetMapping("/comparacao")
    public String mostraComparacao(@RequestParam("cpf") String cpf, Model model) {
        List<Audiometria> audiometrias = comparacaoService.buscarAudiometriasPorCpf(cpf);
        
        if (audiometrias == null || audiometrias.isEmpty()) {
            model.addAttribute("message", "Paciente não encontrado ou sem audiometrias cadastradas.");
        } else {
            model.addAttribute("audiometrias", audiometrias);
        }
        
        return "comparacaoAudio";  // Retorna a página de comparação
    }
}