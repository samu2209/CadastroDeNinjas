package com.claving.CadastroDeNinjas.Missao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MissaoRepository extends JpaRepository<MissoesModel , Long> {

}
