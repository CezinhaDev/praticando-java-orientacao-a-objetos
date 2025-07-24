package CalculaNota;

public class res {
    String nomeAluno;
    double nota1;
    double nota2;
    String situacao;


    public void calculaMedia(){
        double media = (nota1 + nota2) / 2; // calcula media das notas
        System.out.println("Média do aluno " + nomeAluno + ": " + media);
        if( media >= 7.0){
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
    }
}
