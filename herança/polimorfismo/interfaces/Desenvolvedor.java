package herança.polimorfismo.interfaces;

public class Desenvolvedor extends Funcionario{
    private String stack;

    // Construtor
    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario); //super chama o construtor da classe pai Funcionario
        this.stack = stack;
    }

    @Override
    public void exibirDetalhes() {
    System.out.println("\nDetalhes do Desenvolvedor: " + nome + " - Salário: " + salario + " - Stack: " + stack);
    }
}
