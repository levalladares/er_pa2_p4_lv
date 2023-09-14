package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;

public interface MatriculaService {

	public void nuevo(Matricula matricula,String codigo, String cedula);

	public List<MatriculaDTO> reporte();
}
