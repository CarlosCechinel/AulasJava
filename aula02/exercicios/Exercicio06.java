package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;

        System.out.println("Digite aqui o Salario: "); salario=in.nextDouble();

        if(salario<=600){
            System.out.println("Isento do INSS");

        } else {
            if (salario<=1200)
                System.out.println("Valor do INSS é de 20%");
        
            else {
                if (salario<=2000) {
                System.out.println("Valor do INSS é de 25%");
                                    } else
                                        System.out.println("O valor do INSS é de 30%");   
                 }
        
        }

        in.close();
    }
    
}
