package com.claving.CadastroDeNinjas.Ninjas;

import com.claving.CadastroDeNinjas.Missao.MissoesModel;
import jakarta.persistence.*;



import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome ;
    private Integer idade ;
    private String aldeia ;
    private  String email;


    public NinjaModel(String nome, Integer idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia ;
    }

    public NinjaModel(Long id, String nome, Integer idade, String aldeia, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.email = email;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NinjaModel that = (NinjaModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
