package com.example.FinalProjectBayern.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProjectBayern.entities.Nacionalidade;
import com.example.FinalProjectBayern.repositories.NacionalidadeRepository;

@Service

public class NacionalidadeService{
	
	@Autowired
	private NacionalidadeRepository nacionalidadeRepository;
	
	public List<Nacionalidade> getAll(){
		return nacionalidadeRepository.findAll();	
	}
	
	public void saveNacionalidade (Nacionalidade nacionalidade) {
		nacionalidadeRepository.save(nacionalidade);
	}
	
	

	
	
}
