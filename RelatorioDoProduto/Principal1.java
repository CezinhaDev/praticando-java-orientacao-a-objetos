package RelatorioDoProduto;

public class Principal1 {
    public static void main(String[] args) {
        Produto produto =  new Produto(); // criando um novo objeto Produto
        
        produto.nome = "Mouse Gamer"; // atribuindo um valor ao atributo nome do produto
        produto.preco = "R$ 150,00"; // atribuindo um valor ao atributo preco do produto
        produto.quantidade = "25"; // atribuindo um valor ao atributo quantidade do produto

        produto.exibirInformacoes(); // chamando o método para exibir as informações do produto
    }
}
