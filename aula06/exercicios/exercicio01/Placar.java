package exercicios.exercicio01;

//ESTA ERRADO O EXERCICO POIS NESSE CASO CRIEI METODOS E NAO CONSTRUTORES - verificar exercicio do emerson e refazer

public class Placar {
    public Placar(){

    } 
    
    public Placar(String time1, String time2){
        System.out.println(time1+" 0x0 "+time2);
    }

    public Placar(String time1, String time2, int x, int y){
        System.out.println(time1+" "+x+"x"+y+" "+time2);
    }
}
