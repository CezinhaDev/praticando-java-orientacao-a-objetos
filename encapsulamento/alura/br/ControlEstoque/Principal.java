package encapsulamento.alura.br.ControlEstoque;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("João", 0);
        // Aqui você pode adicionar lógica para manipular a conta, como depósitos, saques,
        // transferências, etc.

        conta.depositar(10000);
        conta.sacar(5000);
        conta.exibirInformacoes();
    }
}
