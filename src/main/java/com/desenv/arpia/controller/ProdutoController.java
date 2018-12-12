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

import com.desenv.arpia.domains.Produto;
import com.desenv.arpia.domains.Produto;
import com.desenv.arpia.repositories.ProdutoRepository;
import com.desenv.arpia.repositories.ProdutoRepository;

@RestController("/produto")
public class ProdutoController  extends BaseController<Produto, Integer> {

	
	
	private ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
		this.setRepository(this.produtoRepository);
	}
	
	
	@GetMapping
	public List<Produto> pegarProtudos(){
		return pegarTodos();
	}
	
	
	@GetMapping("/produto/{id}")
	public Produto pegarProduto(@RequestParam Integer id){
		return pegar(id).get();
	}
	
	
	@DeleteMapping("/produto/{id}")
	public void deletarProduto(@RequestParam Integer id){
		deletar(id);
	}
	
	@PostMapping("/produto")
	public ResponseEntity<Object> createProduto(@RequestBody Produto t){
		return this.createProduto(t);
		
	}
	
	
	@PutMapping("/produto/{id}")
	public ResponseEntity<Object> atualizar(@RequestBody Produto t, @PathVariable Integer id) {
		return atualizarT(t, id);
	}
	
}
