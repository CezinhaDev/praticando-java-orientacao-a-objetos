package herança.polimorfismo.interfaces.SistemaNotificacao;

public class Notificacao {
    protected String destinatario;
    protected String mensagem;
 
    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
 
    public void enviar() {};
}