package exercicios.exerciciocontas;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> hashConta; // <Chave,valor>, chave = numero da conta, valor= conta;
    private GerarNumero gerarNumero; //iniciar outra classe

    public GerenciaContas() {
        hashConta = new HashMap<>();
        gerarNumero=new GerarNumero(); // declarar a classe no construtor
    }

    public int novaContaCorrente() {
        int numeroConta=gerarNumero.proximo();
        hashConta.put(numeroConta, new ContaCorrente(numeroConta));
        return numeroConta;
    }

    public int novaContaEspecial(double limite) {
        int numeroConta=gerarNumero.proximo();
        hashConta.put(numeroConta, new ContaCoEspec(numeroConta, limite));
        return numeroConta;
    }

    public int novaContaPoup() {
        int numeroConta=gerarNumero.proximo();
        hashConta.put(numeroConta, new ContaPoup(numeroConta));
        return numeroConta;
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

    String consultarConta(int numeroConta) {{
        Conta conta=hashConta.get(numeroConta); // verificando a partir do codigo o numero da conta + performatico do que verificar a lista
            
        if(conta !=null) {
                return(conta.toString());
            }
            return "Conta não encontrada";
        }
        
    }
}