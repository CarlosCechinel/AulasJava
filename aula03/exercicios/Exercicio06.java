package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        int par, impar, numero,somap;
        double percentual,media;

        par=0;
        impar=0;
        numero=0;
        percentual=0;
        media=0;
        somap=0;

            for (int count=1 ; count <=10; count++ ){
                System.out.printf("Digite o %dº numero: ", count);
                numero=novo.nextInt();
                if (numero % 2 != 0) {
                    impar++;
                    percentual=(double)impar/10; // o correto é fazer o calculo da media e do percentual fora do FOR !!!!
                } else {
                    par++;
                    somap=numero+somap;
                    media=somap/par;

                }
            }
            System.out.println("O percentual de impares é: "+(percentual*100)+"%");
            System.out.println("A media dos pares é: "+media);
            novo.close();
    }
    
}
