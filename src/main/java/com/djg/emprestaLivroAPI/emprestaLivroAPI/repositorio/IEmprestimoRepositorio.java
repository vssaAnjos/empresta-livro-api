package com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Emprestimo;

public interface IEmprestimoRepositorio extends JpaRepository<Emprestimo, Long> {

}
