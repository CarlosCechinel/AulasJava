package exercicios.exerciciocontas;

import java.util.ArrayList;

public class GerenciaContas_old {
    private ArrayList<Conta> listaContas = new ArrayList<>(); // como Conta Corrente, espec e poupanca fazem parte do
                                                              // Conta é possivel criar uma lista unica

    public GerenciaContas_old() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaContas.add(new ContaCorrente(numeroConta));

    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaContas.add(new ContaCoEspec(numeroConta, limite));
    }

    public void novaContaPoup(int numeroConta) {
        listaContas.add(new ContaPoup(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor) {
        for (Conta conta : listaContas) {
            if (numeroConta == conta.getNumero()) { // buscar o numero na conta com o get numero na classe CONTA
                if (conta.Deposito(valor)) {
                    return true;
                } else {
                    return false;
                }

            }
        }
        return false;
    }

    public boolean Sacar(int numeroConta, double valor) {
        for (Conta conta : listaContas) {
            if (numeroConta == conta.getNumero()) { // buscar o numero na conta com o get numero na classe CONTA
                if (conta.Saque(valor)) {
                    return true;
                } else {
                    return false;
                }

            }
        }
        return false;
    }

    public String consultarConta(int numeroConta) {
        for (Conta conta : listaContas) {
            if (numeroConta == conta.getNumero()) { // buscar o numero na conta com o get numero na classe CONTA
                return conta.toString();
                // break; pode ser usado para interromper qualquer ciclo dentro do laço

            }
        }
        return "Conta não encontrada";
    }
}