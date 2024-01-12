package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num, resto;

        System.out.println("Insira um numero: ");
        num = sc.nextInt();

        resto = num % 2;
        if (resto == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

        sc.close();
    }
}
