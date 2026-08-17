package Aula2;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercício 01 -- A Classe Cachorro (Classes e Objetos)

        Cachorro cachorro01 = new Cachorro();
        cachorro01.nome = "Thor";
        cachorro01.raca = "Pinscher";
        cachorro01.latir();

        // Exercício 02 -- O Aluno (Classes e Objetos)

        Aluno aluno01 = new Aluno();
        aluno01.nome = "Nathalia";
        aluno01.curso = "ADS";
        aluno01.idade = 18;
        aluno01.apresentar();

        Aluno aluno02 = new Aluno();
        aluno02.nome = "João";
        aluno02.curso = "Engenharia";
        aluno02.idade = 20;
        aluno02.apresentar();

        // Exercício 03 -- O Construtor de Filmes (Construtores)

        Filme filme01 = new Filme("Matrix", 1999);

        // Exercício 04 -- O Carro e o Construtor (Construtores)

        Carro carro01 = new Carro("Fiat", "Uno");
        carro01.acelerar(10);

        // Exercício 05 -- Herança Animal (Herança)

        Gato gato01 = new Gato();
        gato01.nome = "Cookie";
        gato01.comer();
        gato01.miar();

        // Exercício 06 -- Funcionários da Empresa (Herança)

        Gerente gerente01 = new Gerente();
        gerente01.nome = "Nathalia";
        gerente01.salario = 3000;
        gerente01.departamento = "TI";
        gerente01.apresentarGerente();

        // Exercício 07 -- O Polimorfismo do Som (Polimorfismo)
        
        Animal2 cachorro02 = new Cachorro2();
        Animal2 vaca = new Vaca();
        cachorro02.emitirSom();
        vaca.emitirSom();

        // Exercício 08 -- Formas Geométricas (Polimorfismo)

        Forma desenho01 = new Quadrado();
        Forma desenho02 = new Circulo();
        desenho01.desenhar();
        desenho02.desenhar();

        // Exercício 09 -- A Conta de Banco Completa (Desafio Intermediário)

        Conta conta01 = new Conta("Nathalia", 1000);
        conta01.depositar(500);
        conta01.sacar(200);
        conta01.sacar(2000);

        // Exercício 10 -- O Sistema de Loja (O Grande Desafio Final)

        Produto produto01 = new Eletronico("Camiseta", 29.99, 110);
        produto01.exibirDetalhes();
        Produto produto02 = new Roupa("Calça Jeans", 79.99, "M");
        produto02.exibirDetalhes();
    }
}