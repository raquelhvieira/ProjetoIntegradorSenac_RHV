
package com.easyaudio.pi3_easyaudio.controller;


import com.easyaudio.pi3_easyaudio.model.Fono;
import com.easyaudio.pi3_easyaudio.service.FonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/fonos")
public class FonoController {

    @Autowired
    private FonoService fonoService;

    @GetMapping
    public String listarFonos(Model model) {
        List<Fono> fonos = fonoService.findAll();
        model.addAttribute("fonos", fonos);
        return "fono/lista";
    }

    @GetMapping("/{id}")
    public String exibirFono(@PathVariable Long id, Model model) {
        fonoService.findById(id).ifPresent(fono -> model.addAttribute("fono", fono));
        return "fono/detalhes";
    }

    @GetMapping("/novo")
    public String mostrarFormularioNovoFono(Model model) {
        model.addAttribute("fono", new Fono());
        return "fono/formulario";
    }

    @PostMapping
    public String salvarFono(@ModelAttribute Fono fono) {
        fonoService.save(fono);
        return "redirect:/fonos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
        fonoService.findById(id).ifPresent(fono -> model.addAttribute("fono", fono));
        return "fono/formulario";
    }

    @PostMapping("/editar/{id}")
    public String editarFono(@PathVariable Long id, @ModelAttribute Fono fono) {
        fono.setId(id);
        fonoService.save(fono);
        return "redirect:/fonos";
    }

    //VER AINDA/PESQUISAR
    //@GetMapping("/excluir/{id}")
    //public String excluirFono(@PathVariable Long id) {
    //    fonoService.deleteById(id);
    //    return "redirect:/fonos";
    //}
}
