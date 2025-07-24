package ZeraSaldo;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta(); // criando um novo objeto Conta
        conta.saldo = 1579.42; // atribuindo um valor ao saldo da conta
        
        conta.exibirSaldo(); // chamando o método para exibir o saldo da conta
        conta.zeraSaldo(); // chamando o método para zerar o saldo da conta
        conta.exibirSaldo(); // chamando novamente o método para exibir o saldo após zerar
    }
}
