package com.claving.CadastroDeNinjas.Ninjas;

public class NinjaDTO {

    private String nome ;
    private Integer idade ;
    private String aldeia ;
    private  String email;

    public NinjaDTO() {
    }

    public NinjaDTO(NinjaModel entity) {

        this.nome = entity.getNome();
        this.idade = entity.getIdade();
        this.aldeia = entity.getAldeia() ;
        this.email = entity.getEmail() ;
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
}
