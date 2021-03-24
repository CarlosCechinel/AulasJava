package exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<Integer,String> mapa= new HashMap<>(); // bi hash map tem uma chave (representada nesse exemplo como integer) e valor.

        mapa.put(1,"um");
        mapa.put(2,"dois");
        mapa.put(3,"tres");
        mapa.put(4,"quatro");
        mapa.put(5,"cinco");

        System.out.println("  3 = "+mapa.get(3)); // quando essa funcao tras null significa que nao existe (para testar fazer get com posicao 32)
    } 
}
