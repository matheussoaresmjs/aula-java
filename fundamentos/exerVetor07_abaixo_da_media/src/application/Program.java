package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double mediavetor, totalvetor;
        totalvetor = 0;

        System.out.print("Quantos elementos o vetor tera? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            totalvetor += vect[i];
        }
        
        mediavetor = totalvetor / n;

        System.out.printf("MEDIA DO VETOR = %.3f\n", mediavetor);
        System.out.printf("ELEMENTOS ABAIXO DA MEDIA = \n");

        for (int i = 0; i < n; i++) {
            if (vect[i] < mediavetor) {
                System.out.printf("%s\n", vect[i]);
            }
        }

        sc.close();
    }
}
