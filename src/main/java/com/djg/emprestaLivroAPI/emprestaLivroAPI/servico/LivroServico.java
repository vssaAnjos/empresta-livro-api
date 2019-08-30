package com.djg.emprestaLivroAPI.emprestaLivroAPI.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Livro;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio.ILivroRepositorio;

@Service
public class LivroServico {

	@Autowired
	private ILivroRepositorio livroRepositorio;
	
	public void salva(Livro livro) {
		livroRepositorio.save(livro);
	}
}
