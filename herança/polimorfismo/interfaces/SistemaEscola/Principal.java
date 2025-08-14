package herança.polimorfismo.interfaces.SistemaEscola; 
// Define o pacote onde a classe está localizada, ajudando na organização do projeto.

public class Principal {
    public static void main(String[] args) {
        // Criação de dois objetos Aluno com nome, idade e média
        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        // Criação de dois objetos Docente com nome, idade e disciplina
        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "História");

        // Exibindo os detalhes de cada aluno
        aluno1.exibirDetalhes();
        aluno2.exibirDetalhes();

        // Exibindo os detalhes de cada docente
        docente1.exibirDetalhes();
        docente2.exibirDetalhes();
    }
}
