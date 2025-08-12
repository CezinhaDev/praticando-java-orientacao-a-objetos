package herança.polimorfismo.interfaces;

public class Principal {
    public static void main(String[] args) {
        // Criação de objetos e utilização das interfaces

        // Exemplo de uso da classe Funcionario
        Gerente gerente = new Gerente("Carlos", 5000);
        gerente.exibirDetalhes();
        gerente.reajusteDeSalario(2);
        gerente.setBonus(1000);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Ana", 4000, "Java");
        desenvolvedor.exibirDetalhes();
    }
}
