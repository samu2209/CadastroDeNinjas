package com.claving.CadastroDeNinjas.Missao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    @Autowired
    MissaoService missaoService ;

    @GetMapping
    public List<MissaoDTO> findAll(){

        return missaoService.findAll()  ;

    }

    @GetMapping("{id}")
    public ResponseEntity<MissaoDTO> findById(@PathVariable Long id){
        MissaoDTO missao = missaoService.findById(id) ;
        return ResponseEntity.ok(missao) ;
    }


}
