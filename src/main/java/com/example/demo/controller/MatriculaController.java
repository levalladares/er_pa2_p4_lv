package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;
import com.example.demo.service.MatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping("/nuevo")
	public String paginaNuevo(Matricula matricula) {
		return "vistaNuevoMateria";
	}

	@PostMapping("/registro")
	public String registrar(Matricula matricula,@RequestParam("cedula") String cedula, @RequestParam("c1") String codigo) {
		matricula.getEstudiante().setCedula(cedula);
		matricula.getMateria().setCodigo(codigo);
		this.matriculaService.nuevo(matricula,codigo,cedula);
		return "redirect:/matriculas/nuevo";
	}
	
	@GetMapping("/buscar")
	public String buscar(Model model) {
		List<MatriculaDTO> lista= this.matriculaService.reporte();
		model.addAttribute("lista",lista);
		return "vistaListaMatriculas";
	}
}
