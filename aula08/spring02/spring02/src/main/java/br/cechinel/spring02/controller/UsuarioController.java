package br.cechinel.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cechinel.spring02.model.Usuario;
import br.cechinel.spring02.repo.UsuarioRepo;


@RestController
@CrossOrigin("*") // aceita requisioes de qualquer dominio
@RequestMapping("/user") //rota ara chegar na classe
public class UsuarioController {
    
    @Autowired //dependencia
    private UsuarioRepo repo;

    @GetMapping("/id/{id}") // entre {} referncia que vai vir uma variavel pela URL
    public ResponseEntity <Usuario> getUser(@PathVariable int id){

        Usuario usuarioEncontrado=repo.findById(id).orElse(null); // find by ID significa busca por chave primaria
        if (usuarioEncontrado!=null){ //achou o usuário
            return ResponseEntity.ok(usuarioEncontrado);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/all") // metodoutil para o projeto
    public List<Usuario> getAllUser(){ // list é uma interface acima do arraylist
        List<Usuario> lista= (List<Usuario>)repo.findAll();

        return lista;
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userParam){ // requestbody tras a requisicao no corpo da execucao

        Usuario usuarioEncontrado =repo.findByEmailAndSenha(userParam.getEmail(), userParam.getSenha());
        if (usuarioEncontrado!=null){ //achou o usuário
            usuarioEncontrado.setSenha("*********"); //mascarando a senha
            return ResponseEntity.ok(usuarioEncontrado);
        }
        return ResponseEntity.notFound().build();
        }



}
