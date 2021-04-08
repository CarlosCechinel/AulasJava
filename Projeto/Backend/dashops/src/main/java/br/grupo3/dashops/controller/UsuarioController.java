package br.grupo3.dashops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.grupo3.dashops.model.Usuario;
import br.grupo3.dashops.repository.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired // injecao de dependencia, o JPA gera automatico
    private UsuarioRepo repo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userEnviado) {
        Usuario userFound = repo.findByEmailOrRacf(userEnviado.getEmail(), userEnviado.getRacf());

        if (userFound != null) { // verificando existencia do usuraio
            if (userFound.getSenha().equals(userEnviado.getSenha())) {
                return ResponseEntity.ok(userFound);
            }
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/all")
    public List<Usuario> getAllUsers() {
        List<Usuario>  lista = (List<Usuario>) repo.findAll();

        return lista;
    }

}
