package exemplos.exemplo04;

public class Veiculo {
    public static void main(String[] args) {
        Carro v=new Carro("F50", "Ferrari", 2.0);

        v.setConsumo(12.5);

        v.apresentar();
        System.out.println("Consumo: " + v.getConsumo());
    }
    
}
