package urilista02;

/* 
Leia 4 valores inteiros A, B, C e D. 
A seguir, se B for maior do que C e se D for maior do que A,
 e a soma de C com D for maior que a soma de A e B e se C e D, 
 ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", 
 senão escrever "Valores nao aceitos".

Entrada

Quatro números inteiros A, B, C e D.

Saída

Mostre a respectiva mensagem após a validação dos valores.

*/

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        int a,b,c,d;
        String resposta;
        final String resposta1="Valores aceitos";
        final String resposta2="Valores nao aceitos";

        a=novo.nextInt();
        b=novo.nextInt();
        c=novo.nextInt();
        d=novo.nextInt();

        if ((b>c)&&(d>a)&&(c+d>a+b)&&(c>0)&&(d>0)&&(a%2==0)) {
            resposta=resposta1;
        } else {
            resposta=resposta2;
        }
        System.out.println(resposta);
        novo.close();

    }
    
}
