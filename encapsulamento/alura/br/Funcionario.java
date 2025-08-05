package encapsulamento.alura.br;

public class Funcionario {
    private String nome;

    private String cargo;

    private double salario;

    private int controleReajuste = 0;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }


    public void exibirInformacoes(){
        System.out.printf("\nFuncionario %s - Cargo: %s - Salario %.2f",nome,cargo,salario);
    }


    public void reajustarSalario(double percentual){
        if(controleReajuste >=1){
            System.out.println("Nao pode fazer mais reajustes");
        }else{
            controleReajuste++;
        }
        controleReajuste++;
        salario +=salario * (percentual /100);
        System.out.printf("\nNovo Salario de %s é %.2f", nome, salario);
    }
}
