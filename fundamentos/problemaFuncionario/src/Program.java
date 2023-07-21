import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        
        System.out.print("Name: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Desconto: ");
        funcionario.desconto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);
        System.out.println();
        System.out.println("Qual percentual aumentar o salário? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + funcionario);
        sc.close();

    }
    
}
