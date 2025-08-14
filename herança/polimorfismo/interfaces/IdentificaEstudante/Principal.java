package herança.polimorfismo.interfaces.IdentificaEstudante;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", "regular");
        Bolsista aluno2 = new Bolsista("Lucas");
 
        aluno1.identificador();
        aluno2.identificador();
    }
}
