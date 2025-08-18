package herança.polimorfismo.interfaces.SistemaPagamento;

public class Principal {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito();
        BoletoBancario boleto = new BoletoBancario();
        Pix pix = new Pix();

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

    }
}
