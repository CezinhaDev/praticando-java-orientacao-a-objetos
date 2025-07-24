package Estoque;

public class Item {
    String nome;
    int quantidade;



    public void subtrairQuantidade(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("Quantidade insuficiente no estoque.");
        } else {
            this.quantidade -= quantidade;
            System.out.printf("%s: Quantidade atualizada: %d%n", nome, this.quantidade);
        }
    }
}
