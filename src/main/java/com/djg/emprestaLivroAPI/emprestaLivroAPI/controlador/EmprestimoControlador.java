package com.djg.emprestaLivroAPI.emprestaLivroAPI.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.servico.EmprestimoServico;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.vo.EmprestimoVO;

@RestController
public class EmprestimoControlador {
	@Autowired
	private EmprestimoServico emprestimoServico;
	
	@PostMapping("/emprestimo")
	public void criaEmprestimo(@RequestBody EmprestimoVO emprestimoVO) {
		emprestimoServico.salva(emprestimoVO);	
	}
}
