package com.claving.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    @Autowired
    NinjaRepository ninjaRepository ;

    public List<NinjaModel> findAll(){
        List<NinjaModel> ninjas = ninjaRepository.findAll() ;
        return ninjas ;

    }

    public NinjaDTO findById(Long id){
        NinjaModel ninja = ninjaRepository.findById(id).get() ;

        return  new NinjaDTO(ninja) ;
    }


    public NinjaModel criarNinja( NinjaDTO ninja ){

        NinjaModel novoNinja = new NinjaModel() ;
        novoNinja.setNome(ninja.getNome());
        novoNinja.setIdade(ninja.getIdade());
        novoNinja.setEmail(ninja.getEmail());
        novoNinja.setAldeia(ninja.getAldeia());

        return ninjaRepository.save(novoNinja) ;


    }


}
