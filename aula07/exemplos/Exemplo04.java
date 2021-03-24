package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String digitado;

        try {
            System.out.println("Digite um valor inteiro: ");
            digitado = entrada.nextLine();
            numero = Integer.parseInt(digitado); // vuneravel se colocar numero decimal gera exeption
            System.out.println("Voce digitou " + numero);
        } catch (InputMismatchException ex) { // esse input e uma classe dentro do dava, existem diversas classes de
                                              // erros
            System.out.println("Digitacao invalida");
            System.out.println(ex.getMessage()); // puxa a mensagem de erros
        } catch (NumberFormatException ex) {
            System.out.println("Numero invalido");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Deu ruim..");
            System.out.println(ex.getMessage());
        } finally { // sempre é executado
            System.out.println("Encerrando conexoes");
            entrada.close();
        }
        System.out.println("Final");
        entrada.close();

    }
}
