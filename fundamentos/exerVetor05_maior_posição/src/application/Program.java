package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posmaior;
        double maior;

        System.out.print("Quantos numeros sera inserido? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        maior = vetor[0];
        posmaior = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) { //*Se o maior valor do vetor[i] for maior que o vetor[maior] */
                maior = vetor[i];   //* Então vetor[maior] vai receber o maior valor do vetor[i] */
                posmaior = i;   //* e posmaior vai receber a maior posição do maior valor do vetor[i] */
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n ", posmaior);

        sc.close();
    }
}
