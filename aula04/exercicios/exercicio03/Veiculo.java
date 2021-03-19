package exercicios.exercicio03;

public class Veiculo {
    public static void main(String[] args) {
        Carro v=new Carro("F50", "Ferrari", 9.0);

        v.apresentar();
        System.out.println("Consumo: " + v.kml());
    }
    
}
