package ControlEstoque;

public class Principal {
    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}
