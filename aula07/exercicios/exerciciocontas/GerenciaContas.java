package exercicios.exerciciocontas;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> hashConta; // <Chave,valor>, chave = numero da conta, valor= conta;

    public GerenciaContas() {
        hashConta = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        hashConta.put(numeroConta, new ContaCorrente(numeroConta));

    }

    public void novaContaEspecial(int numeroConta, double limite) {
        hashConta.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoup(int numeroConta) {
        hashConta.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta=hashConta.get(numeroConta); // verificando a partir do codigo o numero da conta + performatico do que verificar a lista
            if(conta !=null){
                if(conta.Deposito(valor)){
                    return true;
                } else{
                    return false;
                }
            }

        return false;
    }

    public boolean Sacar(int numeroConta, double valor) {
        Conta conta=hashConta.get(numeroConta); // verificando a partir do codigo o numero da conta + performatico do que verificar a lista
            if(conta !=null){
                if(conta.Saque(valor)){
                    return true;
                } else{
                    return false;
                }
            }
            return false;
        }

    private String consultarConta(int numeroConta) {{
        Conta conta=hashConta.get(numeroConta); // verificando a partir do codigo o numero da conta + performatico do que verificar a lista
            
        if(conta !=null) {
                return(conta.toString());
            }
            return "Conta não encontrada";
        }
        
    }
}