package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();

        lista.add(1.1);
        lista.add(1.2);
        lista.add(1.3);
        lista.add(1.4);

        for (Double numero1 : lista) { // para cada numero da estrutura lista faça:
            System.out.println(numero1);

           
        }

        for (int i = 0; i < lista.size();) { // verificando elemento na lista
            System.out.println(lista.get(i));
            if (lista.get(i) == 1.3 ){ // localizando elemento da lista
                System.out.println("Valor encontrado: "+lista.get(i)+ " na posição: "+i);
                System.out.println("Removendo...");
                lista.remove(i); // removendo elemento da lista
            } else {
                i++;
            }
            }
        System.out.println(lista);
    }
    
}
