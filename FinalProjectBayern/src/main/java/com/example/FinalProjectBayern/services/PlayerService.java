package com.example.FinalProjectBayern.services;

import com.example.FinalProjectBayern.entities.Player;
import com.example.FinalProjectBayern.repositories.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findById(Integer id) {
        Optional<Player> player = playerRepository.findById(id);
        return player.orElseThrow(() -> new RuntimeException("A id do jogador não foi encontrada"  ));
    }

    public String addPlayer(Player player) {
        playerRepository.save(player);
        return "Jogador Adicionado com Sucesso!";
    }

    public String editPlayer(Integer id, Player updatedPlayer) {
        Player existingPlayer = findById(id);
        existingPlayer.setJogadores(updatedPlayer.getJogadores());
        existingPlayer.setCamisas(updatedPlayer.getCamisas());
        existingPlayer.setEscalas(updatedPlayer.getEscalas());
       
       

        playerRepository.save(existingPlayer);
        return "Player atualizado com sucesso!";
    }

    public void deleteById(Integer id) {
        playerRepository.deleteById(id);
    }
}