
package com.easyaudio.pi3_easyaudio.controller;

import com.easyaudio.pi3_easyaudio.model.Paciente;
import com.easyaudio.pi3_easyaudio.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public String listarPacientes(Model model) {
        List<Paciente> pacientes = pacienteService.findAll();
        model.addAttribute("pacientes", pacientes);
        return "paciente/lista";
    }

    @GetMapping("/{id}")
    public String exibirPaciente(@PathVariable Long id, Model model) {
        pacienteService.findById(id).ifPresent(paciente -> model.addAttribute("paciente", paciente));
        return "paciente/detalhes";
    }

    @GetMapping("/novo")
    public String mostrarFormularioNovoPaciente(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "paciente/formulario";
    }

    @PostMapping
    public String salvarPaciente(@ModelAttribute Paciente paciente) {
        pacienteService.save(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
        pacienteService.findById(id).ifPresent(paciente -> model.addAttribute("paciente", paciente));
        return "paciente/formulario";
    }

    @PostMapping("/editar/{id}")
    public String editarPaciente(@PathVariable Long id, @ModelAttribute Paciente paciente) {
        paciente.setId(id);
        pacienteService.save(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/excluir/{id}")
    public String excluirPaciente(@PathVariable Long id) {
        pacienteService.deleteById(id);
        return "redirect:/pacientes";
    }
}