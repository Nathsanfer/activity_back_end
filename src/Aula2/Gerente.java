package Aula2;

public class Gerente extends Funcionario {
    String departamento;

    void apresentarGerente() {
        System.out.println("Meu nome é " + nome + " sou do departamento de " + departamento + " e recebo " + salario + " por mês.");
    }
}
