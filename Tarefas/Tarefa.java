package Tarefas;

public class Tarefa {
    String nome;
    String descricao;
    boolean concluida;

    void marcarComoConcluida() {
        concluida = true;
    }

    void exibir() {
        if(concluida) {
            System.out.println("Tarefa concluída: " + nome);
        } else {
            System.out.println("Tarefa pendente: " + nome);
        }
        System.out.println("Descrição: " + descricao);
        
    }
}
