package encapsulamento.alura.br.NivelDeBateria;

public class Principal {
    public static void main(String[] args) {
        Bateria bateria = new Bateria(0);

        bateria.setBateria(85);
        System.out.println("Status: " + bateria.exibirInformacoes());
    }
}
