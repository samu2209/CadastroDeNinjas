package com.claving.CadastroDeNinjas.Missao;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class MissaoController {

    MissoesModel novaMissao = new MissoesModel("Matar Madara Uchirra" , "SS") ;

    @GetMapping("/missao")
    public String missao(){
        return novaMissao.toString() ;
    }

}
