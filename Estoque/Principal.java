package Estoque;

public class Principal {
    public static void main(String[] args) {
        Item produto = new Item();
        produto.nome = "Caneta Azul";
        produto.quantidade = 50;

        produto.subtrairQuantidade(10); // subtraindo 10 unidades do estoque
        produto.subtrairQuantidade(60); // tentando subtrair mais do que o disponível
    }
}