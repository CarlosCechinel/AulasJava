package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
    double salario;
    
    System.out.println("Digite o valor do salario a ser aumentado: "); salario= entrada.nextDouble();

    salario = salario*1.25;

    System.out.println("O salário final é de: " + salario);

    entrada.close();
    }

}
