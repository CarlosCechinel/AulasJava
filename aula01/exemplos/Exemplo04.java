package exemplos;

import java.util.Scanner;

/**
 * Exemplo04
 */
public class Exemplo04 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt(); // entrada de valor na variável
        System.out.println("você digitou: " + numero);

        entrada.close();
    }
}