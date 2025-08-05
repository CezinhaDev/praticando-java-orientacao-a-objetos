package encapsulamento.alura.br.AgendaDeContatos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Contato> contatos =  new ArrayList<>();

        contatos.add(new Contato("Cesar", "11991490986"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));
        contatos.add(new Contato("Mariana Costa", "(41) 96666-0000"));
        contatos.add(new Contato("Carlos Souza", "(51) 95555-0000"));


        //exibir os contatos

        System.out.println("------------- Lista de contatos: ------------");

        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }
    }
}
