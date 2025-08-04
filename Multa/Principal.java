package Multa;

public class Principal {
    public static void main(String[] args) {
        Multa multa = new Multa();
        multa.titulo = "Dom Casmurro";
        multa.diasAtraso = 3;

        multa.exibirMulta((int) multa.diasAtraso); // Convertendo para int pois o método espera int
    }
}
