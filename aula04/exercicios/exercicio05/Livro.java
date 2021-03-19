package exercicios.exercicio05;

public class Livro {
    private int totalPaginas, paginaAtual, proximaPag,pagAnterior,iPag;
    private String titulo, autor;

public Livro(String titulo, String autor, int totalPaginas){ //pressuponto que comece na pagina 0 portanto nao comeca com pagina atual;
    this.titulo=titulo;
    this.autor=autor;
    this.totalPaginas=totalPaginas;
}
public void avancaPagina(){
        paginaAtual=paginaAtual+1;
        if (proximaPag>totalPaginas){
            System.out.println("Não é possivel avançar");
            paginaAtual=paginaAtual-1;
        }

    }
    void retrocederPagina(){ //ok
        paginaAtual=paginaAtual-1;
        if(pagAnterior<0){
            System.out.println("Não é possivel retroceder");
            pagAnterior=paginaAtual+1;
        }
    }
    void irPag(int totalPaginas, int iPag){
        if (iPag>totalPaginas){
            System.out.println("Não foi possivel localizar a página");

        }
    }
    public int exibirPagina(){ //ok
            return paginaAtual;
        }
    public void mostrarCapa(int paginaAtual){
        paginaAtual=0;
        System.out.println(titulo + ", autor: "+autor+ " paginas: "+totalPaginas);
    }
}
