package Aula3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Exercício 01 -- Captura de dados do usuário

        /*
         * System.out.println("Digite o nome do aluno: ");
         * String nome = scanner.nextLine();
         * 
         * System.out.println("O nome digitado foi: " + nome);
         */

        // Exercício 02 -- Verificação de maioridade

        /*
         * System.out.println("Digite a idade do usuário: ");
         * int idade = scanner.nextInt();
         * 
         * if (idade >= 18 ) {
         * System.out.println("Maior de idade");
         * } else {
         * System.out.println("Menor de idade");
         * }
         */

        // Exercício 03 -- Maior entre dois números

        /*
         * System.out.println("Digite um valor inteiro:");
         * int valor01 = scanner.nextInt();
         * System.out.println("Digite outro valor inteiro:");
         * int valor02 = scanner.nextInt();
         * 
         * if (valor01 > valor02) {
         * System.out.println("O maior valor é: " + valor01);
         * } else if (valor02 > valor01) {
         * System.out.println("O maior valor é: " + valor02);
         * } else {
         * System.out.println("Os valores são iguais.");
         * }
         */

        // Exercício 04 -- Desconto em uma compra

        /*
         * System.out.println("Digite o valor da compra: ");
         * double valorCompra = scanner.nextDouble();
         * 
         * int desconto;
         * double valorEconomizado;
         * double valorTotal;
         * 
         * if (valorCompra <= 100) {
         * System.out.println("Para o valor de R$ " + valorCompra +
         * " não existe desconto!");
         * } else if (valorCompra <= 500) {
         * desconto = 10;
         * valorEconomizado = (valorCompra * desconto) / 100;
         * valorTotal = valorCompra - valorEconomizado;
         * System.out.println("Parabéns pelo desconto de " + desconto + "%.");
         * System.out.println("Você economizou R$ " + valorEconomizado +
         * ". O valor final da compra é de R$ " + valorTotal + ".");
         * } else {
         * desconto = 15;
         * valorEconomizado = (valorCompra * desconto) / 100;
         * valorTotal = valorCompra - valorEconomizado;
         * System.out.println("Parabéns pelo desconto de " + desconto + "%.");
         * System.out.println("Você economizou R$ " + valorEconomizado +
         * ". O valor final da compra é de R$ " + valorTotal + ".");
         * }
         */

        // Exercício 05 -- Sistema simples de pedidos

        /*
         * System.out.println("----- Cardápio -----");
         * System.out.println("1 - Hambúrguer R$ 20.00");
         * System.out.println("2 - Pizza R$ 35.00");
         * System.out.println("3 - Cachorro-Quente R$ 15.00");
         * System.out.println("4 - Refrigerante R$ 8.00");
         * 
         * System.out.println("Escolha uma opção: ");
         * int opcao = scanner.nextInt();
         * 
         * switch (opcao) {
         * case 1:
         * System.out.println("Foi selecionado a opção 1: Hambúrguer R$ 20.00");
         * break;
         * case 2:
         * System.out.println("Foi selecionado a opção 2: Pizza R$ 35.00");
         * break;
         * case 3:
         * System.out.println("Foi selecionado a opção 3: Cachorro-Quente R$ 15.00");
         * break;
         * case 4:
         * System.out.println("Foi selecionado a opção 4: Refrigerante R$ 8.00");
         * break;
         * }
         */

        // Exercício 06 -- Calculadora de IMC

        /*
         * System.out.println("Digite o peso em kg:");
         * double peso = scanner.nextDouble();
         * System.out.println("Digite a altura em metros:");
         * double altura = scanner.nextDouble();
         * 
         * double imc = peso / (altura * altura);
         * 
         * String resultado;
         * 
         * if (imc < 18.5) {
         * resultado = "Abaixo do peso";
         * } else if (imc <= 24.9) {
         * resultado = "Peso Normal";
         * } else if (imc <= 29.9) {
         * resultado = "Sobrepeso";
         * } else if (imc <= 30) {
         * resultado = "Obesidade";
         * } else {
         * resultado = "IMC inválido";
         * }
         * 
         * System.out.println("Seu IMC é: " + imc + " -> " + resultado);
         */

        // Exercício 07 -- Sistema de atendimento bancário

        /*
         * System.out.println("Digite o saldo atual da conta: ");
         * int saldo = scanner.nextInt();
         * 
         * System.out.println("--- Sistema Bancário ---");
         * System.out.println("1 - Consultar saldo");
         * System.out.println("2 - Depositar dinehiro");
         * System.out.println("3 - Sacar dinheiro");
         * System.out.println("4 - Sair do sistema");
         * 
         * System.out.println("Selecione uma das opções: ");
         * int opcao = scanner.nextInt();
         * 
         * switch (opcao) {
         * case 1:
         * System.out.println("Saldo atual: R$ " + saldo);
         * break;
         * case 2:
         * System.out.println("Digite o valor do deposito: ");
         * int deposito = scanner.nextInt();
         * 
         * if (deposito <= 0) {
         * System.out.
         * println("O valor do depósito não pode ser igual ou inferior a zero!");
         * System.out.println("Digite o valor do deposito: ");
         * int novodeposito = scanner.nextInt();
         * saldo += novodeposito;
         * System.out.println("Novo saldo: R$ " + saldo);
         * } else {
         * saldo += deposito;
         * System.out.println("Novo saldo: R$ " + saldo);
         * }
         * break;
         * case 3:
         * System.out.println("Digite o valor do saque: ");
         * int saque = scanner.nextInt();
         * 
         * if (saque > saldo) {
         * System.out.println("Saldo insuficiente para realizar o saque!");
         * System.out.println("Digite o valor do saque: ");
         * int novosaque = scanner.nextInt();
         * saldo -= novosaque;
         * System.out.println("Novo saldo: R$ " + saldo);
         * } else if (saque <= 0) {
         * System.out.println("O valor do saque não pode ser igual ou inferior a zero!"
         * );
         * System.out.println("Digite o valor do saque: ");
         * int novosaque = scanner.nextInt();
         * saldo -= novosaque;
         * System.out.println("Novo saldo: R$ " + saldo);
         * 
         * } else {
         * saldo -= saque;
         * System.out.println("Novo saldo: R$ " + saldo);
         * }
         * break;
         * case 4:
         * System.out.println("Saindo do sistema...");
         * break;
         * }
         */

    }
}