package com.example.FinalProjectBayern.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Insira um jogador válido")
    private String jogadores;  

    private Integer camisas;  

    private String escalas;  

    @ManyToOne
    @JoinColumn(name = "nacionalidade_id")
    private Nacionalidade nacionalidade;  

    // Construtores
    public Player() {}

    public Player(Integer id, String jogadores, Integer camisas, String escalas, Nacionalidade nacionalidade) {
        this.id = id;
        this.jogadores = jogadores;
        this.camisas = camisas;
        this.escalas = escalas;
        this.nacionalidade = nacionalidade;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJogadores() {
        return jogadores;
    }

    public void setJogadores(String jogadores) {
        this.jogadores = jogadores;
    }

    public Integer getCamisas() {
        return camisas;
    }

    public void setCamisas(Integer camisas) {
        this.camisas = camisas;
    }

    public String getEscalas() {
        return escalas;
    }

    public void setEscalas(String escalas) {
        this.escalas = escalas;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
