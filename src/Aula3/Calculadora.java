package Aula3;

public class Calculadora {
    double valor01;
    double valor02;

    public Calculadora(double valor01, double valor02) {
        this.valor01 = valor01;
        this.valor02 = valor02;
    }

    void somar() {
        double resultado = valor01 + valor02;
        System.out.println("O resultado da soma é: " + resultado);
    }

    void subtrair() {
        double resultado = valor01 - valor02;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    void multiplicar() {
        double resultado = valor01 * valor02;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    void dividir() {
        if (valor02 != 0) {
            double resultado = valor01 / valor02;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}
