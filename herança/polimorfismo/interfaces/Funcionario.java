package herança.polimorfismo.interfaces;

public class Funcionario {
    // Atributos da classe Funcionario
    private String nome;
    private double salario;
    
    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    // Método para reajustar o salário
    public void reajusteDeSalario(double percentual){
        salario += salario * percentual / 100;
        System.out.println("Novo salário após reajuste de " + percentual + "%: " + nome + ", " + salario);
    }


}
