package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MateriaRepository;
import com.example.demo.repository.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MateriaServiceImpl implements MateriaService{

	@Autowired
	private MateriaRepository materiaRepository; 
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void nuevo(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.crear(materia);
	}
	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Materia> listaMaterias() {
		// TODO Auto-generated method stub
		return this.materiaRepository.listaMaterias();
	}

}
