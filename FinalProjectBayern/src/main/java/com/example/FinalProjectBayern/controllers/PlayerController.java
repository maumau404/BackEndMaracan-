package com.example.FinalProjectBayern.controllers;

import com.example.FinalProjectBayern.entities.Player;
import com.example.FinalProjectBayern.services.PlayerService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

    @Autowired
    private PlayerService service;
    
    @Operation(summary = "Lista de Player",
    		   description =  "Esse método retorna uma lista de jogadores")
    
    @GetMapping
    public ResponseEntity <List<Player>> findAll() {
        List<Player> userList = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(userList);
    }
    @Operation(summary = "Procurar por id",
  		   description =  "Esse método busca jogadores por id")
    @GetMapping(value = "/{id}")
    public ResponseEntity <Player> findById(@PathVariable Integer id) {
        Player response = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    @Operation(summary = "adicionar jogador",
  		   description =  "Esse método adiciona jogadores")
    @PostMapping
    public ResponseEntity <String> addPlayer(@RequestBody @Valid Player player) {
        String response = service.addPlayer(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
    @Operation(summary = "Editar jogador",
  		   description =  "Esse método edita jogador por id")
    @PutMapping(value = "/{id}")
    public ResponseEntity <String> editPlayer(@PathVariable Integer id, @RequestBody Player player) {
        String response = service.editPlayer(id, player);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Operation(summary = "deletar",
 		   description =  "Esse método deleta jogadores por id")
    @DeleteMapping("/{id}")
    public ResponseEntity <String> deletePlayer(@PathVariable Integer id) {
        service.deleteById(id);
        return new ResponseEntity<String>("Jogador deletado com sucesso!", HttpStatus.OK);
    }
}