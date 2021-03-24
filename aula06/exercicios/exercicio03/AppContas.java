package exercicios.exercicio03;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        ContaCorrente cc;
        ContaCoEspec ce;
        ContaPoup cp;
        int opcao,numeroConta;
        double limite;


        do{
        System.out.println("1- Nova conta corrente");
        System.out.println("2- Nova conta especial");
        System.out.println("3- Nova conta poupança");
        System.out.println("4- Depósito");
        System.out.println("5- Saque");
        System.out.println("6- Consultar saldo");
        System.out.println("7- Sair");
        System.out.print("Opção ---> ");
        opcao= teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o numero da conta: ");
                numeroConta=teclado.nextInt();
                cc=new ContaCorrente(numeroConta);
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
                break; // interrompe a execucao do case

            case 2:
                System.out.println("Informe o numero da conta: ");
                numeroConta=teclado.nextInt();
                System.out.println("Informe o limite da conta: ");
                limite = teclado.nextDouble();
                ce=new ContaCoEspec(numeroConta, limite);
                break;

            case 3:
                System.out.println("Informe o numero da conta: ");
                numeroConta=teclado.nextInt();
                cp= new ContaPoup(numeroConta);
                break;

            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Opçao invalida. Digite uma das opcoes abaixo");
                break;
        }

        } while ( opcao!= 7);

        
        teclado.close();
    }
}
