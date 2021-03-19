package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        double valor, media;
        int pos;

        valor=0;
        media=0;
        pos=0;

        for (int count=1 ; count<=6 ; count++){
            valor=  novo.nextDouble();
                if (valor>=0) {
                    pos++;
                    media=media+valor;
                }
        }
        media=media/pos;
        System.out.println(pos+" valores positivos");
        System.out.printf("%.1f\n",media);
        novo.close();

    }
    
}
