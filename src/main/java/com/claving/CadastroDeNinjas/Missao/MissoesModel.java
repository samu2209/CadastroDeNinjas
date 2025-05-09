package com.claving.CadastroDeNinjas.Missao;

import com.claving.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome ;
    private String rank ;
    private Boolean missaoAberta;
    //uma missão podem ter varios ninjas
    @OneToMany(mappedBy = "missaoAtual")
    private List<NinjaModel> ninjasAtribuidos;

    public MissoesModel() {
    }

    public MissoesModel(String nome, String rank) {
        this.nome = nome;
        this.rank = rank;
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

    public Boolean getMissaoAberta() {
        return missaoAberta;
    }

    public void setMissaoAberta(Boolean missaoAberta) {
        this.missaoAberta = missaoAberta;
    }

    public List<NinjaModel> getNinjasAtribuidos() {
        return ninjasAtribuidos;
    }

    public void setNinjasAtribuidos(List<NinjaModel> ninjasAtribuidos) {
        this.ninjasAtribuidos = ninjasAtribuidos;
    }

    @Override
    public String toString() {
        return "MissoesModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
