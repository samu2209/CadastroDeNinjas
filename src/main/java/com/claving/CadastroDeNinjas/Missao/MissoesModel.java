package com.claving.CadastroDeNinjas.Missao;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String rank;


    public MissoesModel() {
    }

    public MissoesModel(String nome, String rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public MissoesModel(Long id, String nome, String rank) {
        this.id = id;
        this.nome = nome;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "MissoesModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MissoesModel that = (MissoesModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
