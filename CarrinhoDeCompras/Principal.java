package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criando os itens
        Carrinho item1 =  new Carrinho();
        item1.nome = "teclado";
        item1.preco = 120.0;
        item1.quantidade = 1;

        Carrinho item2 = new Carrinho();
        item2.nome = "mouse";
        item2.preco = 150.0;
        item2.quantidade = 2;

        // Criando a lista de carrinho
        List<Carrinho> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        // Calculando o total
        double totalCompra = 0;
        for (Carrinho item : itens) {
            totalCompra += item.retornaValorTotal();

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}}
