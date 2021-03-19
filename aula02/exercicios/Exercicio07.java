package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c;

        System.out.println("Digite o valor de a: "); a=entrada.nextDouble();
        System.out.println("Digite o valor de b: "); b=entrada.nextDouble();
        System.out.println("Digite o valor de c: "); c=entrada.nextDouble();

        if (a > b+c || (b > a+c) || (c> a+b)) {
            System.out.println("Não é um triangulo");
        } else{
            if ((a==b) && (b==c)) {
                System.out.println("O triângulo é equilátero");
            } else {
                if ((a==b) || (b==c) || (c==a)) {
                    System.out.println("O triângulo é isósceles");
                } else {
                    System.out.println("O triângulo formado é escaleno");
                }
            }

            }
            entrada.close();
        } 
    
    }

