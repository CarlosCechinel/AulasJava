package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner novo= new Scanner(System.in);
        final String SENHA_CORRETA = "2002";
        String senha;

        senha=novo.nextLine();

        while(!senha.equals(SENHA_CORRETA)){ //comparacao de negacao de string
            System.out.println("Senha Invalida");
            senha=novo.nextLine();
        
        } 
        System.out.println("Acesso Permitido");

        novo.close();
        }

    }
    
