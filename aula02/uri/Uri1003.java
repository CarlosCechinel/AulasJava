package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,y, soma;

        x= entrada.nextInt();
        y= entrada.nextInt();
        soma= x+y;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}
