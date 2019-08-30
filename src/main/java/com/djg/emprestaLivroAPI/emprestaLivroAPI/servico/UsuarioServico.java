package com.djg.emprestaLivroAPI.emprestaLivroAPI.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Usuario;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio.IUsuarioRepositorio;

@Service
public class UsuarioServico {
	@Autowired
	private IUsuarioRepositorio usuarioRepositorio;
	
	public void salva(Usuario usuario) {
		usuarioRepositorio.save(usuario);
	}
}
