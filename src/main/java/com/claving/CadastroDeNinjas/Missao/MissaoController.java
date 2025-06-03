package com.claving.CadastroDeNinjas.Missao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    @Autowired
    MissaoService missaoService ;

    @GetMapping
    public List<MissoesModel> findAll(){

        return missaoService.findAll()  ;

    }


}
