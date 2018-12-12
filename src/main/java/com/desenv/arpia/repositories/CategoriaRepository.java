package com.desenv.arpia.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desenv.arpia.domains.Categoria;;


@Repository
@Transactional
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
