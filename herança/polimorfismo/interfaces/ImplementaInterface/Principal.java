package herança.polimorfismo.interfaces.ImplementaInterface;

public class Principal {
    public static void main(String[] args) {
        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado.");
        rel.imprimir();
    }
}
