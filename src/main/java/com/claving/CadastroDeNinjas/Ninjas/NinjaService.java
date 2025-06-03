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


}
