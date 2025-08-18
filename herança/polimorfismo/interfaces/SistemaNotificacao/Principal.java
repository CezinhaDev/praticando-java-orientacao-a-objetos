package herança.polimorfismo.interfaces.SistemaNotificacao;

public class Principal {
    public static void main(String[] args) {
        Notificacao email = new Email(
                "cliente@exemplo.com",
                "Aproveite nossos descontos esta semana.",
                "Promoção especial!");
 
        Notificacao sms = new Notificacao(
                "(11) 98765-4321",
                "Sua fatura foi paga com sucesso.");
 
        Notificacao push = new Notificacao(
                "usuario_app",
                "Você tem uma nova mensagem não lida.");
 
        email.enviar();
        sms.enviar();
        push.enviar();
    }
}