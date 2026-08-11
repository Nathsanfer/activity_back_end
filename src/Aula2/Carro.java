package Aula2;

public class Carro {

    int velocidade = 0;

    public Carro(String marca, String modelo) {
        System.out.println("O carro é do/a " + marca + " e do modelo é " + modelo);
    }

    void acelerar(int velocidade) {
        System.out.println("A velocidade atual é de " + velocidade + " Km/h");
    }
}
