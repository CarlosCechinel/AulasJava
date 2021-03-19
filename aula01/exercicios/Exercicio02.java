package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        double NotaP1;
        double NotaP2;
        double Media;

        System.out.println("Digite a nota da P1: "); NotaP1 = entrada.nextDouble();
        System.out.println("Digite a nota da P2: "); NotaP2 = entrada.nextDouble();

        //Processamento de dados
        Media = (NotaP1 + NotaP2)/2;

        //saida de dados
        System.out.println("A média final é: " + Media);

        entrada.close(); // sempre fechar a entrada para economia de recurso

    }
    
}
