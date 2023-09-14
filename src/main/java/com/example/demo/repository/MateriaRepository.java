package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface MateriaRepository {
	
	public void crear( Materia materia);
	
	public List<Materia> listaMaterias();
	

}
