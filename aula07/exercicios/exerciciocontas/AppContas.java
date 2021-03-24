package exercicios.exerciciocontas;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, numeroConta;
        double limite, valor;
        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("1- Nova conta corrente");
            System.out.println("2- Nova conta especial");
            System.out.println("3- Nova conta poupança");
            System.out.println("4- Depósito");
            System.out.println("5- Saque");
            System.out.println("6- Consultar saldo");
            System.out.println("7- Sair");
            System.out.print("Opção ---> ");
            opcao = teclado.nextInt();

            switch (opcao) {
            case 1:
                numeroConta= contas.novaContaCorrente();
                System.out.println("Conta crida: "+numeroConta);
                break; // interrompe a execucao do case

            case 2:
                System.out.println("Informe o limite da conta: ");
                limite = teclado.nextDouble();
                numeroConta= contas.novaContaEspecial(limite);
                System.out.println("Conta criada: "+numeroConta+"\nLimite: "+limite);
                break;

            case 3:
                numeroConta= contas.novaContaPoup();
                System.out.println("Conta crida: "+numeroConta);
                break;

            case 4:
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Digite o valor a ser depositado: ");
                valor = teclado.nextInt();
                if (contas.depositar(numeroConta, valor)) {   // chamando o metodo tempos separacao de interfce e logica
                    System.out.println("Operaçao realizada"); // esse metodo permite migrar de interface sem precisar
                                                              // alterar metodo
                } else {
                    System.out.println("Falha na operação");
                }
                break;
            case 5:
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Digite o valor a ser Sacado: ");
                valor = teclado.nextInt();
                if (contas.Sacar(numeroConta, valor)) {       // chamando o metodo tempos separacao de interfce e logica
                    System.out.println("Operaçao realizada"); // esse metodo permite migrar de interface sem precisar
                                                              // alterar metodo
                } else {
                    System.out.println("Falha na operação");
                }
                break;
            case 6:
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println(contas.consultarConta(numeroConta));
                break;
            case 7:
                break;
            default:
                System.out.println("Opçao invalida. Digite uma das opcoes abaixo");
                break;
            }

        } while (opcao != 7);

        teclado.close();
    }
}
