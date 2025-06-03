package com.claving.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){

        return "Seja bem vindo novamente" ;

    }



}
