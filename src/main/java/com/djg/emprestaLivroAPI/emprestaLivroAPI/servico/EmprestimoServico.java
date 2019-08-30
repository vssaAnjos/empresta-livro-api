package com.djg.emprestaLivroAPI.emprestaLivroAPI.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.*;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio.IEmprestimoRepositorio;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio.ILivroRepositorio;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio.IUsuarioRepositorio;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.vo.EmprestimoVO;

@Service
public class EmprestimoServico {
	@Autowired
	private IEmprestimoRepositorio emprestimoRepositorio;
	@Autowired
	private ILivroRepositorio livroRepositorio;
	@Autowired
	private IUsuarioRepositorio usuarioRepositorio;
	
	
	public void salva(EmprestimoVO emprestimoVO) {
		
		Livro livro = livroRepositorio.findById(emprestimoVO.getCodigoLivro()).get();
		Usuario usuario = usuarioRepositorio.findById(emprestimoVO.getCodigoUsuario()).get();
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setLivro(livro);
		emprestimo.setUsuario(usuario);
		emprestimo.setDataDevolucao(emprestimoVO.getDataDevolucao());
		emprestimo.setDataSolicitacao(emprestimoVO.getDataSolicitacao());
		
		emprestimoRepositorio.save(emprestimo);
	}
	
}
