package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        double mediapares, totalpares, totalvetorpar;
        totalvetorpar = 0;

        System.out.print("Quantos elementos vai ter no vetor? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        totalpares = 0;
        mediapares = 0;
        
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                totalpares++;
                totalvetorpar += vect[i];
            }
        }

        mediapares = totalvetorpar / totalpares;

        if (mediapares > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
