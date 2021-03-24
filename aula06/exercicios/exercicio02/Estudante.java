package exercicios.exercicio02;

public class Estudante extends Pessoa {
    private String curso;

public Estudante(String nome, String telefone, String curso){
    super(nome,telefone); // sempre iniciar a classe antes, se colocar o this antes da erro.
    this.curso=curso;
}
@Override
public String toString() {
    return super.toString()+"\nCurso: "+curso;
}

}
