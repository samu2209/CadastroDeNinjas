package com.claving.CadastroDeNinjas.Missao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissaoController {

    MissoesModel novaMissao = new MissoesModel("Matar Madara Uchirra" , "SS") ;

    @GetMapping("/missao")
    public String missao(){
        return novaMissao.toString() ;
    }

}
