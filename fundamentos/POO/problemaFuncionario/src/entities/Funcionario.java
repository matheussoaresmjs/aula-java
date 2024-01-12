package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double desconto;

    public double netSalary() {
        return salarioBruto - desconto;
    }

    public void increaseSalary(double percentage) {
        salarioBruto += (salarioBruto * percentage) /100.0; 
        //adicional em percentual sobre o valor(Já adicionando)
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", netSalary());
    }

}
