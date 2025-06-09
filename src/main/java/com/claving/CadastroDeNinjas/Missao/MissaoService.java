package com.claving.CadastroDeNinjas.Missao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    @Autowired
    MissaoRepository missaoRepository ;


    public List<MissaoDTO> findAll(){

        List<MissaoDTO> missoes =  missaoRepository.findAll()
                .stream()
                .map(MissaoDTO::new).toList();

        return  missoes ;

    }

    public MissaoDTO findById( Long id ){
        MissoesModel missao = missaoRepository.findById(id).get() ;
        return new MissaoDTO(missao) ;

    }


}
