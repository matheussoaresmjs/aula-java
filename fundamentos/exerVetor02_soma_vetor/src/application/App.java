package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double soma = 0; 
        double media = 0;
        
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < vect.length; i++){
            soma = soma + vect[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }
        
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
