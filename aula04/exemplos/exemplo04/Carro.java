package exemplos.exemplo04;

public class Carro {
    private String modelo,marca;
    private double consumo; // comando private para nao ser alterado de forma indevida -> sempre o menor acesso possivel

    Carro(String modelo, String marca, double consumo){ // inicializando atraves do construtor
        this.modelo=modelo;
        this.marca=marca;
        setConsumo(consumo); 
    }

    //metodos açao, comportamento -> utilizados para alterar os atributos
        void apresentar(){
        System.out.println("Modelo: "+ modelo + " Marca: "+ marca);}

     double getConsumo (){
            return consumo;}

    public void setConsumo (double novconsumo){
        if (novconsumo > 0){
        consumo = novconsumo;
                    }

    }
}