package encapsulamento.alura.br.CadastroDeVeiculos;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat cronos","ABC-1234" , 2025);

        System.out.println("----------------Cadastro de veiculo---------------------");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Ano: " + carro.getAno());
    }
}
