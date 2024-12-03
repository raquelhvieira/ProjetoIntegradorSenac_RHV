
package com.easyaudio.pi3_easyaudio.controller;


import com.easyaudio.pi3_easyaudio.model.Audiometria;
import com.easyaudio.pi3_easyaudio.service.AudiometriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/audiometrias")
public class AudiometriaController {

    @Autowired
    private AudiometriaService audiometriaService;

    @GetMapping
    public String listarAudiometrias(Model model) {
        List<Audiometria> audiometrias = audiometriaService.findAll();
        model.addAttribute("audiometrias", audiometrias);
        return "audiometria/lista";
    }

    @GetMapping("/{id}")
    public String exibirAudiometria(@PathVariable Long id, Model model) {
        audiometriaService.findById(id).ifPresent(audiometria -> model.addAttribute("audiometria", audiometria));
        return "audiometria/detalhes";
    }

    @GetMapping("/novo")
    public String mostrarFormularioNovaAudiometria(Model model) {
        model.addAttribute("audiometria", new Audiometria());
        return "audiometria/formulario";
    }

    @PostMapping
    public String salvarAudiometria(@ModelAttribute Audiometria audiometria) {
        audiometriaService.save(audiometria);
        return "redirect:/audiometrias";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
        audiometriaService.findById(id).ifPresent(audiometria -> model.addAttribute("audiometria", audiometria));
        return "audiometria/formulario";
    }

    @PostMapping("/editar/{id}")
    public String editarAudiometria(@PathVariable Long id, @ModelAttribute Audiometria audiometria) {
        audiometria.setId(id);
        audiometriaService.save(audiometria);
        return "redirect:/audiometrias";
    }

    //VER AINDA/PESQUISAR
    //@GetMapping("/excluir/{id}")
    //public String excluirAudiometria(@PathVariable Long id) {
    //    audiometriaService.deleteById(id);
    //    return "redirect:/audiometrias";
    //}
}
