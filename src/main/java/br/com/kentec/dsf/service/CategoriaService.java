package br.com.kentec.dsf.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.dsf.domain.Categoria;
import br.com.kentec.dsf.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository cr;
	
	public Optional<Categoria> mostrarUmaCategoria(Long id){
		return cr.findById(id);
	}
	
	public Iterable<Categoria> listarTodasCategorias(){
		return cr.findAll();
	}
	
	public void salvarCategoria(Categoria categoria) {
		cr.save(categoria);
	}
	
	public void alterarCategoria(Categoria categoria) {
		Optional<Categoria> cat = cr.findById(categoria.getId());
		if(cat.isPresent()) {
			cr.save(categoria);
		} 
	}
	
	public void inativarCategoria(Long id, String inativar) {
		Optional<Categoria> cat = cr.findById(id);
		cat.ifPresent(c ->{
			c.setStatus(inativar);
			cr.save(c);
		});
	}
	
	public Iterable<Categoria> mostrarCategoriaAtiva(){
		return cr.mostrarCategoriaAtiva();
	}

}
