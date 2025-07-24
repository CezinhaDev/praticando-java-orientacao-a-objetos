package Temperatura;

public class Principal {
    public static void main(String[] args) {
        Alerta alerta = new Alerta(); // criando um novo objeto Alerta
        alerta.local = "Sala de Servidores"; // atribuindo um valor ao local do alerta
        alerta.temperaturaAtual = 32.5; // atribuindo um valor à temperatura
        alerta.verificaAlerta(); // chamando o método para verificar o alerta de temperatura
    }
}
