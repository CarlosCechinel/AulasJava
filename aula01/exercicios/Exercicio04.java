package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, watts, vconsu, vresi, vdesc;

        System.out.println("Digiteo valor do Salario minimo: "); salario = entrada.nextDouble();
        System.out.println("Digite a quantidade dw watts consumida: "); vconsu = entrada.nextDouble();

        watts= salario/500;
        vresi= vconsu*watts;
        vdesc= vresi*0.85;

        System.out.println("Custo R$/Kw: " + watts );
        System.out.println("O valor a ser pago pela residencia é de: R$" + vresi);
        System.out.println("Valor a ser pago com desconto é: R$" + vdesc);

        entrada.close();

    }
    
}
