package ResumoLivro;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;


    public void exibirInformacoes() {
       System.out.printf("Título: %s\nAutor: %s\nAno de Publicação: %d\n", titulo, autor, anoPublicacao); //desse jeito o texto fica mais bonito, em outro formato
    }
}
