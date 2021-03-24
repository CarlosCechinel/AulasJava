package exemplos.exemplo01;

// quando é criada uma subclasse  mesmsa tem que respeitar toos os parametros da anterior

public class Gerente extends Funcionario { // extends puxa os atributos e metodos da classe funcionario

    double salario;


    public Gerente (String nome, double salario, int funcionarios) {
        super(nome,salario); // super = chamada ao construtor funcionario
        // funcao utilizada para herdar os parametros da classe declarada no extends
        }


    @Override
    public String exibir() {
        return super.exibir()+ ": "+salario;}
        
    
    @Override
    public void nsalario(double porc){
        super.nsalario(porc+20);
        }

    
}
