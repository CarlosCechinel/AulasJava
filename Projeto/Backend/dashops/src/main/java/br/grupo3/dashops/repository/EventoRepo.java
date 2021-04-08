package br.grupo3.dashops.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import br.grupo3.dashops.model.Evento;

public interface EventoRepo extends CrudRepository<Evento, Integer> {
    public List<Evento> findByDataevtBetweenOrderByDataevt(LocalDate iniDate, LocalDate finalDate);
}
