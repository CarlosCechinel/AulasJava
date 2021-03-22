package uri;

import java.util.Scanner;

/**
 * Uri1018
 */
public class Uri1018 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, re1,re2,re3,re4,re5,re6,x;

        valor= entrada.nextInt();

        re1=valor/100;
        x=(valor%100);
        re2=x/50;
        x=x%50;
        re3=x/20;
        x=x%20;
        re4=x/10;
        x=x%10;
        re5=x/5;
        x=x%5;
        re6=x/2;
        x=x%2;

        System.out.println(valor);
        System.out.println(re1 + " nota(s) de R$ 100,00");
        System.out.println(re2 + " nota(s) de R$ 50,00");
        System.out.println(re3 + " nota(s) de R$ 20,00");
        System.out.println(re4 + " nota(s) de R$ 10,00");
        System.out.println(re5 + " nota(s) de R$ 5,00");
        System.out.println(re6 + " nota(s) de R$ 2,00");
        System.out.println(x + " nota(s) de R$ 1,00");

        entrada.close();
        

    }
}