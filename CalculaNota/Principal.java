package CalculaNota;

public class Principal {
    public static void main(String[] args) {
        res resultado = new res(); // criando um novo objeto res
        resultado.nota1 = 7.5; // atribuindo um valor à primeira nota
        resultado.nota2 = 8.0; // atribuindo um valor à segunda nota
        resultado.nomeAluno = "João Silva"; // atribuindo o nome do aluno
        resultado.calculaMedia(); // chamando o método para calcular a média e verificar a situação do aluno
        System.out.println("Situação do aluno " + resultado.nomeAluno + ": " + resultado.situacao); // exibindo a situação do aluno
    }
}
