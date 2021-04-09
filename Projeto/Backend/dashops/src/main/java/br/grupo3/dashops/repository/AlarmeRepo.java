package br.grupo3.dashops.repository;

import org.springframework.data.repository.CrudRepository;

import br.grupo3.dashops.model.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer> {
    public Alarme findByNome(String nome);
}
