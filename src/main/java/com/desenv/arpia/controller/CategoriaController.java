package com.desenv.arpia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desenv.arpia.domains.Categoria;
import com.desenv.arpia.repositories.CategoriaRepository;



@RestController("/categoria")
public class CategoriaController extends BaseController<Categoria, Integer> {
	

	private CategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaController(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
		this.setRepository(this.categoriaRepository);
	}
	
	
	@GetMapping("/categoria")
	public List<Categoria> pegarTs(){
		return pegarTodos();
	}
	
	
	@GetMapping("/categoria/{id}")
	public Categoria pegarCategoria(@RequestParam Integer id){
		return pegar(id).get();
	}
	
	
	@DeleteMapping("/categoria/{id}")
	public void deletarCategoria(@RequestParam Integer id){
		deletar(id);
	}
	
	@PostMapping("/categoria")
	public ResponseEntity<Object> createCategoria(@RequestBody Categoria t){
		return this.createT(t);
		
	}
	
	
	@PutMapping("/categoria/{id}")
	public ResponseEntity<Object> atualizar(@RequestBody Categoria t, @PathVariable Integer id) {
		return atualizarT(t, id);
	}



}
