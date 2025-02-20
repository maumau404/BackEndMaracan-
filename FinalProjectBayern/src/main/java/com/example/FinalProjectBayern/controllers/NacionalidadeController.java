package com.example.FinalProjectBayern.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProjectBayern.entities.Nacionalidade;
import com.example.FinalProjectBayern.services.NacionalidadeService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value= "/nacionalidades")
public class NacionalidadeController {
	
	@Autowired
	private NacionalidadeService service;
	
	@GetMapping
	public ResponseEntity <List<Nacionalidade>> gellAll(){
		List<Nacionalidade> lista = service.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	@PostMapping
	public ResponseEntity<String> saveNacionalidade (@RequestBody Nacionalidade nacionalidade){
		service.saveNacionalidade(nacionalidade);
		return ResponseEntity.status(HttpStatus.CREATED).body("Nacionalidade Cadastrada");
		
	}
	

}
