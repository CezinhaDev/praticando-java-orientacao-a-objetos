package Temperatura;

public class Alerta {
    String local;
    double temperaturaAtual;


    public void verificaAlerta(){
        if(temperaturaAtual > 30.0){
            System.out.println("Alerta: Temperatura alta em " + local + "! Temperatura atual: " + temperaturaAtual + "°C");
        } else {
            System.out.println("Temperatura em " + local + " está normal: " + temperaturaAtual + "°C");
        }

        System.out.println("Verificação de alerta concluída para " + local);
    }
}
