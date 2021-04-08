package br.grupo3.dashops.repository;

import org.springframework.data.repository.CrudRepository;

import br.grupo3.dashops.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmailOrRacf(String email, String racf);
}
