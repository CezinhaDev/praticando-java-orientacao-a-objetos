package herança.polimorfismo.interfaces.EnviandoMensagens;

public class Notificador {
    // isso é sobre carga que sao varios metodos na mesma classe
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }
 
    public void enviarMensagem(String nome, String mensagem) {
        System.out.println("Mensagem para " + nome + ": " + mensagem);
    }
 
    public void enviarMensagem(String nome, String mensagem, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Mensagem para " + nome + ": " + mensagem);
        }
    }
}