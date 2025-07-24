package br.com.alura;

public  class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(); // criando um novo objeto Funcionario
        //atribuindo um valor ao atributo nome do objeto funcionario1
        funcionario1.nome = "João"; // atribuindo um valor ao atributo nome
        funcionario1.cargo = "Desenvolvedor"; // atribuindo um valor ao atributo cargo
        funcionario1.salario = 3000.00; // atribuindo um valor ao atributo


        Funcionario funcionario2 = new Funcionario(); // criando outro objeto Funcionario
        funcionario2.nome = "Maria"; // atribuindo um valor ao atributo nome do segundo objeto
        funcionario2.cargo = "Gerente"; // atribuindo um valor ao atributo cargo do segundo objeto
        funcionario2.salario = 5000.00; // atribuindo um valor ao atributo salario do segundo objeto

        funcionario2.exibirInformacoes(); // chamando o método para exibir informações do primeiro funcionário
        funcionario2.ajusteSalario(5); // chamando o método para ajustar o salário do segundo funcionário
    }
    
}
