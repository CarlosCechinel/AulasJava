package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String SENHA_CORRETA = "R10p5";
        String senha;
        

        System.out.println("Digite sua senha aqui: "); senha=entrada.nextLine();

        if(senha.equals(SENHA_CORRETA)){
            System.out.println("Senha aceita");
        
        } else {
            System.out.println("Senha invalida");
        }

        entrada.close();
    }
}
