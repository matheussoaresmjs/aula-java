package apliccation;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz?");
        int n = sc.nextInt();

        System.out.println("Digite os valores da matriz: ");
        int[][] vet = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int m = 0; m < n; m++) {
                vet[i][m] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i][i] + " ");
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int m = 0; m < n; m++) {
                if (vet[i][m] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);
    
        sc.close();
    }
}
