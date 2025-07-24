package Tarefas;

import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Java";
        t1.concluida = false;
 
        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;
 
        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
 
        for (Tarefa t : lista) {
            t.exibir();
        }
    }
}
