package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont,x,y;

        System.out.println("Digite o valor a ser calculado: "); 
        x=entrada.nextInt();
        y=0;
        cont=0;

        while (y<10*x) {
            y=x*cont;
            System.out.println(x+" X "+cont+" = "+y);
            cont++;
        }
        entrada.close();
    }
    
}
