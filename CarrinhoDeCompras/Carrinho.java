package CarrinhoDeCompras;

public class Carrinho {
    String nome;
    double preco;
    int quantidade;


    public double retornaValorTotal(){
        return preco * quantidade;
    }
}
