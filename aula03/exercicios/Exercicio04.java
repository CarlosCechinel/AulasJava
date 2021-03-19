package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        int valor, soma;

        System.out.print("Digite um numero (para encerrar o cliclo digite 0): ");
        valor=novo.nextInt();
        soma=0;

        while (valor>0) {
            soma=valor+soma;
            System.out.print("Digite um numero (para encerrar o cliclo digite 0): ");
            valor=novo.nextInt();}

        System.out.print("A soma dos valores é: "+soma);
        novo.close();
        System.out.println("");
        
    }
    
}
