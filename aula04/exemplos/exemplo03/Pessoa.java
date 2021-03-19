package exemplos.exemplo03;

public class Pessoa {
            //atributos= caracteristica que possui, é
            String nome;

            //mettodos açao, comportamento
            void apresentar(){
                System.out.println("Olá!! eu sou "+ nome);
    
            }

            //construtor
            Pessoa(String n){
                nome = n; // inicializando a pessoa atraves do construtor
            }
                        /* construtor
                        Pessoa(String nome){
                            this.nome = nome; -> this é utilizado para remover o confilo de mesmo nome de parametro e atributo.
                            */ 
                            
            // Pessoa(){} -> construtor padrao, caso nao seja setado como acima o sistema acata esse.
}
