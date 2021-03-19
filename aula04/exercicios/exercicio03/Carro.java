package exercicios.exercicio03;

public class Carro {
    private String modelo,marca;
    private double consumo; // comando private para nao ser alterado de forma indevida

    Carro(String modelo, String marca, double consumo){ // inicializando atraves do construtor
        this.modelo=modelo;
        this.marca=marca;
        this.consumo=consumo; }

    //metodos açao, comportamento
        void apresentar(){
        System.out.println("Modelo: "+ modelo + " Marca: "+ marca);}

     double kml (){
            return consumo;}
}