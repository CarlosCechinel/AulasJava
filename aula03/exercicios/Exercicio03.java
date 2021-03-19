package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        int n, valor, sequencia;

        System.out.println("Digite o valor maximo: ");
        valor=novo.nextInt();
        n=1;
        sequencia=0;

        while (valor>=n){
            sequencia=n;
            n=2*n;
            System.out.print(sequencia);
            if (n<=valor){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        novo.close();
    }
    
}
