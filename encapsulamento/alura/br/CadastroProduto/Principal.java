package encapsulamento.alura.br.CadastroProduto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto(null, 0);
        produto.setNome("Mouse");
        produto.setPreco(-78.00);


        System.out.printf("Produto: %s\nPreço: %.2f\n", produto.getNome(), produto.getPreco());
    }
}
