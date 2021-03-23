package exempos.exemplo01;

public class App {
    public static void main(String[] args) {
        Gerente g= new Gerente();

        g.nome="Fernando";
        System.out.println(g.exibir()); // consegue chamar exibir() dentro do system out pois o metodo esta como STRING
    }
    
}
