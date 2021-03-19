package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double p1,p2,p3,media;

        p1= entrada.nextDouble();
        p2= entrada.nextDouble();
        p3= entrada.nextDouble();
        media=(p1*0.2)+(p2*0.3)+(p3*0.5);

        System.out.printf("MEDIA = %.1f\n",media);

        entrada.close();
    }
}
