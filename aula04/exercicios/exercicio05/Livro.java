package exercicios.exercicio05;

public class Livro {
    private int totalPaginas, paginaAtual, proximaPag,pagAnterior,iPag;
    private String titulo, autor;

public Livro(String titulo, String autor, int totalPaginas){ //pressuponto que comece na pagina 0 portanto nao comeca com pagina atual;
    this.titulo=titulo;
    this.autor=autor;
    verificaPag(totalPaginas);
    this.paginaAtual=0;

}
public void avancaPagina(){
        paginaAtual=paginaAtual+1;
        if (proximaPag>totalPaginas && paginaAtual<=0){
            System.out.println("Não é possivel avançar");
            paginaAtual=paginaAtual-1;
        }
        System.out.println("Pagina atual: "+ paginaAtual);
    }
    void retrocederPagina(){ //ok
        paginaAtual=paginaAtual-1;
        if(pagAnterior<0){
            System.out.println("Não é possivel retroceder");
            pagAnterior=paginaAtual+1;
            System.out.println("pagina atual: "+pagAnterior);
        }
        System.out.println("Você esta na pagina: "+paginaAtual);
    }
    void irPag(int iPag){
        if (iPag>totalPaginas && iPag <-1){
            System.out.println("Não foi possivel localizar a página");

        }
        paginaAtual=iPag;
        System.out.println("Voce foi para a pagina: "+paginaAtual);
    }
    public int exibirPagina(){ //ok
            return paginaAtual;
        }
    public void mostrarCapa(){
        paginaAtual=0;
        System.out.println(titulo + "\nautor: "+autor+ "\npaginas: "+totalPaginas);
    }
    public void verificaPag(int totalPaginas2){
        if (totalPaginas<=0){
            System.out.println("Valor não aceito");
        } 

    }
}
