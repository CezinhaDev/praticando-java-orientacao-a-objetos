package br.com.alura;

public class Funcionario {
    String nome; // atributo para armazenar o nome do funcionário
    String cargo; // atributo para armazenar o cargo do funcionário
    double salario; // atributo para armazenar o salário do funcionário

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    public void ajusteSalario(double percentual){
        salario += salario * percentual / 100; // ajusta o salário com base no percentual fornecido
        System.out.println("Salário ajustado: " + salario);
    }
}

