package exercicios.exerciciocontas;

public class ContaCorrente extends Conta {
    private final double taxaDep=0.1;

public ContaCorrente(int numero){
    super(numero);
}
@Override
public boolean Saque(double valor) {
        if(super.getsaldo()>=valor){
            return super.Saque(valor);
        } return false; // sem saldo
}
@Override
public boolean Deposito(double valor) {
    return super.Deposito(valor-taxaDep);
    }
}
