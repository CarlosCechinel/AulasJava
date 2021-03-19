package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        int num, num2, num3, maior;

        System.out.println("Digite o primeiro valor: ");
        num = novo.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = novo.nextInt();
        System.out.println("Digite o terceiro valor: ");
        num3 = novo.nextInt();
        maior = comp(num, num2, num3);

        System.out.println("O menor valor é: " + maior);
        novo.close();

    }

    static int comp(int num, int num2, int num3) {
        int maior;
            if ((num<num2)&& (num<num3) ){
                maior=num;
            } else {
                if ((num2<num3)&& (num2<num)){
                    maior=num2;
                } else { 
                if ((num3<num)&& (num3<num2)){
                    maior=num3; } else {
                        maior=num;
                    }
            }}
            return maior;
    }
}