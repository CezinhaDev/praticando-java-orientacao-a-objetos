package encapsulamento.alura.br.NivelDeBateria;

public class Bateria {
    private int bateria; // Armazena o nível da bateria de 0 a 100

    // Construtor
    public Bateria(int bateria) {
        this.setBateria(bateria); // Usa o método set para validar
    }

    // Getter
    public int getBateria() {
        return bateria;
    }

    // Setter com validação
    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Valor de bateria inválido! (Deve estar entre 0 e 100)");
        }
    }

    // Método que retorna uma mensagem com base no nível da bateria
    public String exibirInformacoes() {
        if (bateria <= 20) {
            return "Bateria fraca";
        } else if (bateria <= 80) {
            return "Bateria ok";
        } else {
            return "Bateria cheia";
        }
    }
}
