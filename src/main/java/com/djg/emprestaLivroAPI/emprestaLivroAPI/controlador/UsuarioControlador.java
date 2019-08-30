package com.djg.emprestaLivroAPI.emprestaLivroAPI.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Usuario;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.servico.UsuarioServico;

@RestController
public class UsuarioControlador {
		@Autowired
		private UsuarioServico usuarioServico;
		// @Autowired = instanciar usuarioServico = new UsuarioServico()
		
		@PostMapping("/usuario")
		public void criaUsuario(@RequestBody Usuario usuario) {
			usuarioServico.salva(usuario);
			
		}

}
