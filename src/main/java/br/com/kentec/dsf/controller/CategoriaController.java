package br.com.kentec.dsf.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.dsf.domain.Categoria;
import br.com.kentec.dsf.service.CategoriaService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/deltasf/api/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService cs;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Categoria>> mostrarUmaCategoria(@PathVariable("id") Long id){
		return  ResponseEntity.ok(cs.mostrarUmaCategoria(id));
	}
	
	@GetMapping("/listarTodos")
	public ResponseEntity<Iterable<Categoria>> listarTodasCategorias(){
		return ResponseEntity.ok(cs.listarTodasCategorias());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void salvarCategoria(@RequestBody Categoria categoria) {
		cs.salvarCategoria(categoria);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void alterarCategoria(@RequestBody Categoria categoria) {
		cs.alterarCategoria(categoria);
	}
	
	@PatchMapping("/{id}/inativo")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void inativarCategoria(@PathVariable("id") Long id, @RequestBody String inativar) {
		cs.inativarCategoria(id, inativar);	
	}
	
	@GetMapping("/mostrarTodosAtivo")
	public ResponseEntity<Iterable<Categoria>> mostrarCategoriaAtiva() {
		return ResponseEntity.ok(cs.mostrarCategoriaAtiva());
	}
}	
