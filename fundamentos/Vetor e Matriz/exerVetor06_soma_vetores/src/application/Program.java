package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        
        System.out.print("Quantas posicoes tera o vetor: ");
        n = sc.nextInt();

        int[] avetor = new int[n];
        int[] bvetor = new int[n];
        int[] cvetor = new int[n];
            
        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0; i < n; i++) {
            
            avetor[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");

        for (int i = 0; i < n; i++) {
            bvetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cvetor[i] = avetor[i] + bvetor[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", cvetor[i]);
        }

        
        sc.close();
    }
}
