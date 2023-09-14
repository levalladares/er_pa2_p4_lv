package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;

public interface MatriculaRepository {
	
	public void crear( Matricula matricula);
	
	public List<MatriculaDTO> listaDTO();

}
