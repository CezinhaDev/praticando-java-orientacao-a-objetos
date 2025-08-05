package encapsulamento.alura.br.CadastroDeVeiculos;

// Declaração da classe Carro
public class Carro {

    // Atributos (características do carro)
    private String modelo; // Armazena o modelo do carro (ex: "Civic", "Corolla")
    private String placa;  // Armazena a placa do carro (ex: "ABC-1234")
    private double ano;    // Armazena o ano de fabricação do carro (ex: 2020)

    // Construtor da classe Carro
    // Esse método é chamado quando um novo objeto Carro é criado
    public Carro(String modelo, String placa, double ano) {
        this.modelo = modelo  ;    // Define o ano recebido como; // Define o modelo recebido como parâmetro
        this.placa = placa;   // Define a placa recebida como parâmetro
        this.ano = ano; 
     }                      //parâmetro

    // Getter para o atributo modelo
    // Permite acessar o valor de 'modelo' fora da classe
    public String getModelo() {
        return modelo;
    }

    // Setter para o atributo modelo
    // Permite alterar o valor de 'modelo' fora da classe
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para o atributo placa
    // Permite acessar o valor de 'placa' fora da classe
    public String getPlaca() {
        return placa;
    }

    // Setter para o atributo placa
    // Permite alterar o valor de 'placa' fora da classe
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getter para o atributo ano
    // Permite acessar o valor de 'ano' fora da classe
    public double getAno() {
        return ano;
    }

    // Setter para o atributo ano
    // Permite alterar o valor de 'ano' fora da classe
    public void setAno(double ano) {
        this.ano = ano;
    }
}
