package ZeraSaldo;

public class Conta {
    Double saldo;


    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public void zeraSaldo(){
        saldo = 0.0; // zera o saldo da conta
        System.out.println("Saldo zerado: " + saldo);
    }
}

