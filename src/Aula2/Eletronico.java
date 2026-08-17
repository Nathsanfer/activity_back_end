package Aula2;

public class Eletronico extends Produto {
    int voltagem;

    public Eletronico(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    @Override
    void exibirDetalhes() {
        System.out.println("O produto " + nome + " custa R$" + preco + " e possui voltagem de " + voltagem + "V");
    }
}
