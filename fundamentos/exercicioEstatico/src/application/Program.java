package application;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calc;

public class Program {

    public static void main(String[] args) {

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner (System.in);

       System.out.println("Qual é o valor do dolar ? ");
       double dolar = sc.nextDouble();

       System.out.println("Quantidade de dolar a ser comprado: ");
       double quantidade = sc.nextDouble();

       double valorConvertido = Calc.conversor(dolar, quantidade);

       System.out.printf("O valor que deverá ser pago é de %.2f%n: ", valorConvertido);

       sc.close();

    }

   

}
