package encapsulamento.alura.br.ControlEstoque;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de %.2f realizado com sucesso. Saldo atual: %.2f%n", valor, saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de %.2f realizado com sucesso. Saldo atual: %.2f%n", valor, saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }

    }

    public void exibirInformacoes() {
        System.out.printf("Titular: %s - Saldo: %.2f%n", titular, saldo);
    }
}
