package com.claving.CadastroDeNinjas.Missao;

public class MissaoDTO {

    private String nome;
    private String dificuldade;

    public MissaoDTO() {
    }

    public MissaoDTO(MissoesModel entity) {
        this.nome = entity.getNome() ;
        this.dificuldade = entity.getDificuldade() ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
