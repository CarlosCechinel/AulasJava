package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner novo =new Scanner(System.in);
        int variavel;
        boolean resp;

        System.out.println("Digite o numero a ser verificado: ");
        variavel=novo.nextInt();

        resp= verificapar(variavel);
        System.out.println(resp);

        novo.close();

    }
    static void verifica2 (int variavel) {
        if (variavel%2!= 0){
            System.out.println("O numero é impar");
        } else {
            System.out.println("O numero é par");
    }
    
    }
    static boolean verificapar (int variavel) {
        if (variavel % 2 ==0){
            return true;
        }   return false;
    }
}