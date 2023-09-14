package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface MateriaService {
	
	public void nuevo( Materia materia);
	public List<Materia> listaMaterias();

}
