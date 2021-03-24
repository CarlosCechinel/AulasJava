package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f= new Funcionario("Fernando",1500);
        Gerente g= new Gerente("Amanda",3000,10); //objeto

        // g.nome="Fernando";
        f.nsalario(10);
        g.nsalario(10);

        System.out.println(g.exibir()); // consegue chamar exibir() dentro do system out pois o metodo esta como STRING
        System.out.println(f.exibir()); // utilizando toString no funcionario- olhar a aba
        
    }
    
}
