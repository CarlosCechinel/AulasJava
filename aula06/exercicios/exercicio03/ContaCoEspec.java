package exercicios.exercicio03;

public class ContaCoEspec extends Conta {
    private double limite;

public ContaCoEspec(int numero, double limite){
    super(numero);
    this.limite=limite;
}
@Override
public boolean Saque(double valor) {
    if(valor<=(super.getsaldo()+limite)){
        return super.Saque(valor);
    } return false;
}

@Override
public String toString() {
    return super.toString() + " Limite: "+limite;
}

}
