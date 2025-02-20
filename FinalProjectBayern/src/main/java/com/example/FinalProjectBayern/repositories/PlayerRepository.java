package com.example.FinalProjectBayern.repositories;

import java.util.List;
import com.example.FinalProjectBayern.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
    List<Player> findByJogadoresContainingIgnoreCase(String jogadores);
    List<Player> findByCamisas(Integer camisas);
	List<Player> findByEscalas(String escalas);
}
