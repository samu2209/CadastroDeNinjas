package com.claving.CadastroDeNinjas.Ninjas;

import com.claving.CadastroDeNinjas.Missao.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome ;
    private Integer idade ;
    private String aldeia ;
    private  String email;

    // Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn( name = "missoes_id")
    private MissoesModel missaoAtual ;
    private List<MissoesModel> missoesConcluidas ;

    public NinjaModel(String nome, Integer idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
    public void setId(Long id) {
        throw new UnsupportedOperationException("ID é gerado automaticamente e não pode ser alterado.");
    }
}
