package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int entrada1, entrada2;

        System.out.println("Digite o primeiro numero:");
        entrada1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        entrada2 = sc.nextInt();

        if (entrada1 % entrada2 == 0 || entrada2 % entrada1 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        
        sc.close();
    }
}
