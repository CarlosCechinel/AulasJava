package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Livro novo =new Livro("Como programar em java","Carlos", 2 );

        System.out.println("Pagina Atual; " + novo.exibirPagina());

        novo.avancaPagina();
        System.out.println("Pagina atual: ");

        novo.avancaPagina();

        novo.retrocederPagina();

    }
    
}
