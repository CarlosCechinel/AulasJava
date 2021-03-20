package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Livro novo =new Livro("Como programar em Java.","Carlos", -1);

        System.out.println("Pagina Inicial: " + novo.exibirPagina());

        novo.avancaPagina();

        novo.avancaPagina();

        novo.retrocederPagina();

        novo.irPag(2);

        System.out.println("Exibindo página: "+ novo.exibirPagina());

        novo.mostrarCapa();

    }
    
}
