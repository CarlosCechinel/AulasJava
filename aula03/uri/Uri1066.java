package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        int valor, par, impar, pos, neg;

        impar=0;
        pos=0;
        par=0;
        neg=0;

        for (int count = 1; count <= 5; count++) {
            valor=novo.nextInt();
                if (valor%2==0){
                    par++;
                } else {
                    impar++;
                }
                if (valor>0){
                    pos++;
                    } else{ if(valor<0){
                    neg++; }
                            }
            
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");
        novo.close();
    }

}
