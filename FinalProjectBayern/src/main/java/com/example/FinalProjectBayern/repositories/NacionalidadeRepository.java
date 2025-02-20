package com.example.FinalProjectBayern.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FinalProjectBayern.entities.Nacionalidade;

@Repository
public interface NacionalidadeRepository  extends JpaRepository <Nacionalidade, Integer>{

}
