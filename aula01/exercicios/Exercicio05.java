package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double vCarro, fCarro, logi, imp;

        System.out.println("Digite o valor do custo de fabria do carro: "); vCarro = entrada.nextDouble();

        logi = vCarro*0.28;
        imp = vCarro*0.45;
        fCarro = (vCarro+imp+logi);

        System.out.println("Custo de Fabrica: R$"+vCarro);
        System.out.println("Valor final de revenda: R$"+fCarro);

        entrada.close();
    }
    
}
