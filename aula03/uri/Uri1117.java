package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        double media, nota1, nota2, count;

        count=0;
        nota2=0;

        while (count < 2) {
            nota1=novo.nextDouble();
            if ((nota1>=0) && (nota1<=10)){
                nota2=nota1+nota2;
                count++;
            } else {
                System.out.println("nota invalida");
            }
        }
        media=nota2/2;
        System.out.printf("media = %.2f\n",media);
        novo.close();

    }
    
}
