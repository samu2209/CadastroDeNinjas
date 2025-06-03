package com.claving.CadastroDeNinjas.Missao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    @Autowired
    MissaoRepository missaoRepository ;


    public List<MissoesModel> findAll(){

        List<MissoesModel> missoes = missaoRepository.findAll() ;

        return  missoes ;

    }


}
