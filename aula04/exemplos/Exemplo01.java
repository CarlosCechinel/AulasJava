package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Meu programa v 0.1");
        linha(); //chamando o metodo - para atribuir um valor colocar variavel entre parenteses
        System.out.println("Menu");
        linha2(5); //receendo variavel
        linha4("Rabetaaaaao", "-");

    }
    
    static void linha () { //enta sem nada entre os parenteses pois nao recebe nenhum dado, e o void significa sem retorno
        System.out.println("------------------");

    }
    static void linha2 (int tamanho){ // colocando variavel
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
            
        }
        System.out.println();
    }
    static void linha3 (int tamanho, String simbolo){ // colocando variaveeis, cada parametro deve ter o tipo declarado INDIVIDUALMENTE MESMO SE FOR IGUAL
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
            
        }
        System.out.println();
    }
    static void linha4 (String texto, String string){ // colocando variaveeis, cada parametro deve ter o tipo declarado INDIVIDUALMENTE MESMO SE FOR IGUAL
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(string);
            
        }
        System.out.println(); 
    }
}
