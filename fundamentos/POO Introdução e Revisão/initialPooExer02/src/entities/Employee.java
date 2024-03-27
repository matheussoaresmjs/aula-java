package entities;

public class Employee {
    
    public String name;
    public double grossSalary; // salário bruto
    public double tax; // imposto
    // salário liquido
    public double netSalary(){
        return grossSalary - tax;
    }
    //aumentar salario
    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * percentage) / 100;
    }

    public String toString(){
        return name 
        + ", $ "
        + String.format("%.2f", netSalary());
    }

}
