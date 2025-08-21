package herança.polimorfismo.interfaces.ControleDeDispositivo;

public class Principal {
    public static void main(String[] args) {
       Luz luz = new Luz(); 
ArCondicionado ar = new ArCondicionado(); 
         
luz.ligar(); 
luz.ligar(); 
luz.desligar(); 
  
ar.desligar();
    }
}
