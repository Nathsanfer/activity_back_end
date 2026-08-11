package Aula2;

public class Carro {
    String marca;
    String modelo;
    int velocidade = 0;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

        System.out.println("O carro é do/a " + this.marca + " e do modelo é " + this.modelo);
    }

    void acelerar(int velocidade) {
        System.out.println("A velocidade atual é de " + velocidade + " Km/h");
    }
}
