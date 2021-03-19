package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        double salario, imposto;

        salario=novo.nextDouble();
        imposto=0;

        if((salario<=2000) && (salario>=0)){
            System.out.println("Isento");
        } else {
            if ((salario>2000)&& (salario<=3000)) {
                imposto=((salario-2000)*0.08);
                System.out.println("R$ "+imposto);
            } else { if ((salario>3000)&&(salario>=4500)){
                imposto=((1000*0.08)+(salario-3000)*0.18);
                System.out.println("R$ "+imposto);
            } else {
                imposto=((1000*0.08+1500*0.18)+(salario-4500)*0.28);
                System.out.println("R$ "+imposto);
            }

            }

        }
        novo.close();
    }
    
}
