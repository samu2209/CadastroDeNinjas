package com.claving.CadastroDeNinjas.Missao;

import com.claving.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_missao")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome ;
    private String rank ;
    private Boolean missaoAberta;
    @OneToMany(mappedBy = "missaoAtual")
    private List<NinjaModel> ninjasAtribuidos;


    public void setId(Long id){
        throw new UnsupportedOperationException("O ID não pode ser definido, pois já é gerado automaticamente") ;
    }
}
