package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;


	@Override
	public List<MatriculaDTO> reporte() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.listaDTO();
	}

	@Override
	public void nuevo(Matricula matricula, String codigo, String cedula) {
		// TODO Auto-generated method stub
		
		matricula.getMateria().setCodigo(codigo);
		matricula.getEstudiante().setCedula(cedula);
		this.matriculaRepository.crear(matricula);
		
	}

}
