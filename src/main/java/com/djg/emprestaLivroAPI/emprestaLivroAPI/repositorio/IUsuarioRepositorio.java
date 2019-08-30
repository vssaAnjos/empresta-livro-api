package com.djg.emprestaLivroAPI.emprestaLivroAPI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.djg.emprestaLivroAPI.emprestaLivroAPI.dominio.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
