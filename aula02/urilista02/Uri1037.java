package urilista02;

import java.util.Scanner;

/**
 * Uri1037
 */
public class Uri1037 {

    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        double x;
        String resposta;
        final String resposta2="Intervalo (25,50]";
        final String resposta1="Intervalo [0,25]";
        final String resposta3="Intervalo (75,100]";
        final String resposta4="Fora de intervalo";

        x=novo.nextDouble();

        if ((0<=x) && (x<=25)) {
            resposta=resposta1;
        } else {
            if ((0<=x)&&(x<=75)) {
                resposta=resposta2;
            } else {
                if ((0<=x)&&(x<=100)){
                    resposta=resposta3;
                } else {
                    resposta=resposta4;
                }
            }
        }
        System.out.println(resposta);
        novo.close();
    }
}