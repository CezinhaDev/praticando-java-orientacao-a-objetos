package herança.polimorfismo.interfaces;

public class Gerente extends Funcionario { // Herenca do funcionario

    private double bonus; // Atributo específico do Gerente
    
    public Gerente(String nome, double salario) {
        super(nome, salario); // Chama o construtor da classe Funcionario, super é usado para referenciar a classe pai que é Funcionario
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override // Anotação que indica que estamos sobrescrevendo um método da classe pai
    public void exibirDetalhes() {
        // Chama o método exibirDetalhes da classe pai
    System.out.printf("\nDetalhes do Gerente: %s - Salário: %.2f - Bônus: %.2f%n", nome, salario, bonus);
    }
}
