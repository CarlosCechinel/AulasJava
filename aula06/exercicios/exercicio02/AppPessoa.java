package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p=new Pessoa("Carlos","98299-3599");
        Estudante n=new Estudante("Amanda","90323-2323","Engenharia");
        Professor po=new Professor("Emerson","92322-4553",20000);

        System.out.println(p.toString());
        System.out.println(n.toString());
        System.out.println(po.toString());
    }
    
}
