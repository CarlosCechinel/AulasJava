package br.grupo3.dashops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.grupo3.dashops.model.Alarme;
import br.grupo3.dashops.repository.AlarmeRepo;


@RestController
@CrossOrigin("*")
@RequestMapping("/alarmes")
public class AlarmeController {

    @Autowired // injecao de dependencia, o JPA gera automatico
    private AlarmeRepo arepo;
    
    @GetMapping("/tipo")
    public List<Alarme> getAllUsers() {
        List<Alarme>  lista = (List<Alarme>) arepo.findAll();
        return lista;
    }

}
