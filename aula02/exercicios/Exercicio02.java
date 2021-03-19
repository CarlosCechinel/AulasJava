package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //definição de variável
        Scanner in = new Scanner(System.in);
        double p1, p2, media;

        // entrada de dados
        System.out.println("Digite a nota da P1: "); p1=in.nextDouble();
        System.out.println("Digite a nota da P2: "); p2=in.nextDouble();

        // processamento
        media=0.4*p1 + 0.6*p2;

        //condicional
        if (media >=5){
            System.out.println("Voce passou !!!!");

        } else {
            System.out.println("Voce reprovou :( ");
        }

        //resultado
        System.out.printf("Media Final: %.2f", media);
        in.close();
    }
    
}
