package exercicios;

import java.util.Scanner;

/**
 * Exercicio05
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner novo= new Scanner(System.in);
        int numero, par, impar, count;

        numero = 0;
        par = 0;
        impar = 0;
        count = 1;

        for (count = 1; count <= 10; count++) {
            System.out.printf("Digite aqui o %dº numero: ", count);
            numero = novo.nextInt();
            if (numero % 2 != 0) {
                impar++;
            } else {
                par++;
            }

        }
        System.out.println("O total de pares é: " + par);
        System.out.print("O total de impares é: " + impar);
        System.out.println("");
        
        novo.close();
    }

}