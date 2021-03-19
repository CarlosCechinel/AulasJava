package urilista02;

import java.util.Scanner;

/* Salário	Percentual de Reajuste
0 - 400.00        15%
400.01 - 800.00   12%
800.01 - 1200.00  10%
1200.01 - 2000.00  7%
Acima de 2000.00   4%

*/

public class Uri1048 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        double salario,reajuste,x;
        String resposta;
        final String resposta1="Em percentual: 15 %";
        final String resposta2="Em percentual: 12 %";
        final String resposta3="Em percentual: 10 %";
        final String resposta4="Em percentual: 7 %";
        final String resposta5="Em percentual: 4 %";

        salario= novo.nextDouble();
        if ((salario>0)&&(salario<=400)){
            x=salario*1.15;
            resposta=resposta1;
            reajuste=x-salario; } else {
            if (salario<=800){
                x=salario*1.12;
                resposta=resposta2;
                reajuste=x-salario; } else {
                    if (salario<=1200) {
                        x=salario*1.1;
                        resposta=resposta3;
                        reajuste=x-salario; } else {
                            if (salario<=2000) {
                                x=salario*1.07;
                                resposta=resposta4;
                                reajuste=x-salario; } else {
                                    x=salario*1.04;
                                    resposta=resposta5;
                                    reajuste=x-salario;
                                }
                        }
                } 
    }
    System.out.printf("Novo salario: %.2f\n",x);
    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
    System.out.println(resposta);
    novo.close();
}
}
