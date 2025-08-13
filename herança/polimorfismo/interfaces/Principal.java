package herança.polimorfismo.interfaces;

public class Principal {
    public static void main(String[] args) {
        // Criação de objetos e utilização das interfaces

        // Exemplo de uso da classe Funcionario
        Funcionario gerente = new Gerente("Carlos", 5000);
        gerente.exibirDetalhes();
        gerente.reajusteDeSalario(2);
        ((Gerente)gerente).setBonus(1000); // Cast para acessar método específico do Gerente que no caso é setBonus isso se chama downcasting
        ((Gerente)gerente).aprovarProjeto("Projeto X"); // Cast para acessar método da interface Aprovador

        Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000, "Java");
        desenvolvedor.reajusteSalario();
        desenvolvedor.exibirDetalhes();



        
    }
}
