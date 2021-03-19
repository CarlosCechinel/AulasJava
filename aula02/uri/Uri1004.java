package uri;

import java.util.Scanner;

/**
 * Uri1004
 */
public class Uri1004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,y,prod;

        // não funciona no URI pois entende como resposta System.out.println();

        x= entrada.nextInt();
        y= entrada.nextInt();
        prod=x*y;

        System.out.println("PROD = " + prod);

        entrada.close();
    }
}