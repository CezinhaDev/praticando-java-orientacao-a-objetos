package Multa;

public class Multa {
    String titulo;
    double diasAtraso;

    public double calculaDiasDeAtraso(int diasAtraso) {
        return diasAtraso * 2.50;
    }

    public void exibirMulta(int diasAtraso) {
        double valorMulta = calculaDiasDeAtraso(diasAtraso);
        System.out.printf("Título: %s%nMulta: R$ %.2f%n", titulo, valorMulta);
    }
}
