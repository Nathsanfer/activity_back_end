package Aula2;

public class Roupa extends Produto {
    String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    void exibirDetalhes() {
        System.out.println("O produto " + nome + " custa R$" + preco + " e possui tamanho " + tamanho);
    }
}
