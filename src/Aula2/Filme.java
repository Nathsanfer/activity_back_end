package Aula2;

public class Filme {
    String titulo;
    int anoLancamento;

    public Filme(String nome, int anoLancamento) {
        this.titulo = nome;
        this.anoLancamento = anoLancamento;
        
        System.out.println("O filme " + this.titulo + " foi lançado em " + this.    anoLancamento);
    }
}
