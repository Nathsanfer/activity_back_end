package Aula2;

public class Conta {
    String titular;
    int saldo = 0;

    public Conta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
        System.out.println("Conta criada para " + titular + " com saldo inicial de R$" + saldo);
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
