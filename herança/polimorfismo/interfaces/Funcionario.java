package herança.polimorfismo.interfaces;

public class Funcionario {
    // Atributos da classe Funcionario
    protected String nome;
    protected double salario;
    
    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("-----------------------");
    }

    // Método para reajustar o salário
    public void reajusteDeSalario(double percentual){
        salario += salario * percentual / 100;
        System.out.println("\nNovo salário após reajuste de " + percentual + "%: " + nome + ", " + salario);
    }

    public void reajusteSalario(){
        salario += 500;
        System.out.println("\nsalário  " + nome + ", " + salario);
    }

}
