package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x,y;

        System.out.println("Digite o valor de x: "); x= entrada.nextDouble();
        System.out.println("Digite o valor de y: "); y= entrada.nextDouble();

        if (x >= y){

            System.out.println("A ordem ficará: ");
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println("A ordem ficará: ");
            System.out.println(y);
            System.out.println(x);
        }

        entrada.close();

    }
    
}
