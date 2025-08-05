package encapsulamento.alura.br;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Cesar", 8500);
        funcionario.setCargo("Desenvolvedor");

        System.out.println("Funcionario tem o cargo: " + funcionario.getCargo());
        System.out.println("Funcionario tem o nome: " + funcionario.getNome());
        System.out.println("Funcionario tem o salario: " + funcionario.getSalario());

        funcionario.reajustarSalario(5);
        funcionario.reajustarSalario(10);
        funcionario.exibirInformacoes();
    }
}
