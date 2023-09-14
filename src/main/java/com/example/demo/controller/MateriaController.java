package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.MateriaService;


@Controller
@RequestMapping("/materias")
public class MateriaController {
	@Autowired
	private MateriaService materiaService;

	@GetMapping("/nuevo")
	public String paginaNuevo(Materia materia) {
		return "vistaNuevoMateria";
	}

	@PostMapping("/registro")
	public String registrar(Materia materia) {
		this.materiaService.nuevo(materia);
		return "redirect:/materias/buscar";
	}

	@GetMapping("/buscar")
	public String buscar(Model model) {
		List<Materia> lista = this.materiaService.listaMaterias();
		model.addAttribute("lista", lista);
		return "vistaListaMaterias";
	}
	
	@GetMapping("/buscar2")
	public String buscar2(Model model) {
		List<Materia> lista = this.materiaService.listaMaterias();
		model.addAttribute("lista", lista);
		return "vistaListaMaterias2";
	}

}
