package com.claving.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    NinjaService ninjaService ;


    @GetMapping
    public List<NinjaModel> findAll(){
        return ninjaService.findAll();
    }

    @GetMapping("{id}")
    public NinjaDTO findById(@PathVariable  Long id){

        return ninjaService.findById(id) ;

    }

    @PostMapping
    public NinjaModel criarNinja( @RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja) ;
    }





}
