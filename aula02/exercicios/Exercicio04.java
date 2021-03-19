package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double prestacao, salario, credito, parcelas;

        System.out.println("Digite o salario: "); salario= in.nextDouble();
        System.out.println("Digite o credito desejado: "); credito= in.nextDouble();
        System.out.println("Digite o numero de parcelas: "); parcelas= in.nextDouble();


        prestacao = credito/parcelas;

        if (prestacao <= 0.3*salario ){
            System.out.println("Credito aprovado");
        } else {
            System.out.println("Credito reprovado");
        }

        System.out.printf("Valor da prestação: R$%.2f\n",prestacao);
        in.close();
    }
    
}
