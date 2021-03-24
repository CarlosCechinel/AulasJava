package exercicios.exerciciocontas;

public abstract class Conta {
    private int numero;
    private double saldo;
    
public Conta(int numero){
    this.numero=numero;
}

public double getsaldo(){
    return saldo;

}
@Override
public String toString() {
    return "Numero conta: "+numero+"\nSaldo: "+saldo;
}

public boolean Saque(double valor){
    if(valor>0){
    saldo=saldo-valor;
    return true;
    }
    return false;
}

public boolean Deposito(double valor){
    if(valor>0){
    saldo=saldo+valor;
    return true;
    }
    return false;
}
public int getNumero() {
    return numero;
}

}