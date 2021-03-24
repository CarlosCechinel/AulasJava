package exercicios.exerciciocontas;

public class ContaPoup extends Conta {
    private static double taxa =0.1;

    public ContaPoup(int numero){
        super(numero);
    }
    @Override
    public boolean Saque(double valor) {
        if((super.getsaldo()-valor)>=0){
        return super.Saque(valor+(taxa*valor));
        } else {
            return false;
        }
    }
    public static void setTaxa(double novaTaxa){
        if(novaTaxa>0){
            taxa=novaTaxa;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " taxa: "+taxa;
    }
}
