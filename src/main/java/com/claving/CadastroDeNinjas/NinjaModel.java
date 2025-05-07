package com.claving.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome ;
    private Integer idade ;
    private String aldeia ;
    private  String email;

    public NinjaModel(){
    }
    public NinjaModel(String nome, Integer idade, String email,  String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "NinjaModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
