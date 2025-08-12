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

    
}
