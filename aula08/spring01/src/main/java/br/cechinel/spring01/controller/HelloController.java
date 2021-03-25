package br.cechinel.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // classe que recebe requisicao e devolve resposta -> @restcontroller e
                // determinacao dessa funcao
// localhost:8080/users
@RequestMapping("/sample")
public class HelloController {

    @GetMapping("/hello") // mapeamento tem que chegar como /sample/Hello -> conforme exemplo
    public ResponseEntity<String> ola(){
        // return ResponseEntity.ok("Ola mundo"); ok=sucesso canto direito da tela do postman
        return ResponseEntity.notFound().build(); //erro 404 not found
    }

    @PostMapping("/hello") // mapeamento tem que chegar como /sample/Hello -> conforme exemplo
    public String olap() {
        return "Ola mundo via post";

    }
    @GetMapping("/positivo/{numero}") // o par de chaves indica a presenca de uma variavel
    public ResponseEntity<String> epositivo(@PathVariable int numero){ //o ptah esta trazendo a variavel
        if (numero>=0){
            return ResponseEntity.ok("É positivo");
        } else {
            return ResponseEntity.ok("É negativo");
        }
    }

}
