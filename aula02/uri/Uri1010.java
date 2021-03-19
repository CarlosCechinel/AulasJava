package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x,y,z;
        int a,b,c,d;

        a= entrada.nextInt();
        b= entrada.nextInt();
        x= entrada.nextDouble();
        c= entrada.nextInt();
        d= entrada.nextInt();
        y= entrada.nextDouble();

        z= (b*x)+(d*y);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",z);

    }
}
