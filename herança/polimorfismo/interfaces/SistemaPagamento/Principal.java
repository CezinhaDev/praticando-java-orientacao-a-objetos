package herança.polimorfismo.interfaces.SistemaPagamento;

public class Principal {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(0);
        BoletoBancario boleto = new BoletoBancario(0);
        Pix pix = new Pix(0);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

    }
}
