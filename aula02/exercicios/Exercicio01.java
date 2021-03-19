package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero: "); numero = entrada.nextInt();

        if(numero>20){
            numero=numero/2;

            System.out.println("A metade do valor é: "+ (double)numero); // forçando variavel dobre em variavel int
        } else {
            System.out.println("Nao sera feita a conta");
        }

            entrada.close();
    }
    
}
