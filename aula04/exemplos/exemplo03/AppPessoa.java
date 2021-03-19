package exemplos.exemplo03;

// Executavel
/*PARA PROJETO DEVE-SE TER UM UNICO MAIN

*/

public class AppPessoa { 
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Carlos"); // instanciacao do objeto
        Pessoa p2= new Pessoa("Amanda"); // novo objeto com suas proprias caracteristicas
                    //Construtor sendo chamado no Pessoa()
        //p.nome= "Carlos";

        p.apresentar(); // chamando o objeto
        //p2.nome="Amanda";
        p2.apresentar();

    }
}
