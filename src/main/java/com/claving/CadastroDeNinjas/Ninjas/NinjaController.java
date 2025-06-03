package com.claving.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    NinjaRepository ninjaRepository ;
    @GetMapping
    public List<NinjaModel> findAll(){
        return ninjaRepository.findAll();
    }






}
