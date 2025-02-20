package com.example.FinalProjectBayern.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Nacionalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @NotNull(message = "O campo nacionalidade não pode ser nulo")
    private String nacionalidade;

    @JsonIgnore
    @OneToMany(mappedBy = "nacionalidade")
    private Set<Player> players;

    // Construtores
    public Nacionalidade() {}

    public Nacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
