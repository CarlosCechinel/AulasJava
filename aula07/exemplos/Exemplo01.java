package exemplos;

import java.util.Stack;

public class Exemplo01 {
    public static void main(String[] args) {
        Stack <Integer> pilha= new Stack<>(); // dentro do <> deve-se referenciar objeto

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println("Tamanho: "+pilha.size()); // verificando tamanho da pilha
        System.out.println("Topo: "+pilha.peek()); // verificando qual elemento esta no topo


        while (!pilha.isEmpty()){ // ! = não
        System.out.println("Removendo: "+pilha.pop()); //removendo elemento da pilha
        }

    }
    
}
