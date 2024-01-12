package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maior;

        System.out.print("Quantas pessoas serao registradas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            sc.nextLine(); 
            System.out.print("Nome: "); 
            nome[i] = sc.nextLine(); 
            System.out.print("Idade: "); 
            idade[i] = sc.nextInt(); 
        }

        maior = idade[0];

        for (int i = 0; i < n; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (idade[i] == maior) {
                System.out.printf("PESSOA MAIS VELHA: %s\n", nome[i]);
            }
        }

        sc.close();
    }
}
