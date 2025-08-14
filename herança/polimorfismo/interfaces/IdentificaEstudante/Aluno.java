package herança.polimorfismo.interfaces.IdentificaEstudante;

public class Aluno {
    private String nome;
    private String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void identificador(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
    }
}
