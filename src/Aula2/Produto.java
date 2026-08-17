package Aula2;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDetalhes() {
        System.out.println("O produto " + nome + " custa R$" + preco);
    }
}
