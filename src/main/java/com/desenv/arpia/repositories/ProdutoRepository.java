package com.desenv.arpia.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desenv.arpia.domains.Categoria;
import com.desenv.arpia.domains.Produto;;


@Repository
@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
