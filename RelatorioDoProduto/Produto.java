package RelatorioDoProduto;

public class Produto {
    String nome; // atributo para armazenar o nome do produto
    String preco; // atributo para armazenar o preço do produto
    String quantidade; // atributo para armazenar a quantidade do produto

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
