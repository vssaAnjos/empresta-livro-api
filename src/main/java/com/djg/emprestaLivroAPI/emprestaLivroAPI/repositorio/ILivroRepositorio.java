package com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Livro;

public interface ILivroRepositorio extends JpaRepository<Livro, Long>{

}
