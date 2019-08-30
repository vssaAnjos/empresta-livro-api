package com.djg.emprestaLivroAPI.emprestaLivroAPI.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Livro;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.servico.LivroServico;

@RestController
public class LivroControlador {

	@Autowired
	private LivroServico livroServico;
	
	@PostMapping("/livro")
	public void criaLivro(@RequestBody Livro livro) {
		livroServico.salva(livro);
	}
}
