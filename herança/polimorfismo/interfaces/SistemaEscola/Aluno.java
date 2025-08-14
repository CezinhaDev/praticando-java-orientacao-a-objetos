package herança.polimorfismo.interfaces.SistemaEscola;

public class Aluno extends Pessoa {
    private int nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = (int) nota;
    }

    public int getNota() {
        return nota;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nota: " + getNota());
    }
}
