package ResumoLivro;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Java para Iniciantes";
        livro.autor = "Cesar Souza";
        livro.anoPublicacao = 2023;

        livro.exibirInformacoes(); // chamando o método para exibir as informações do livro
    }
}
