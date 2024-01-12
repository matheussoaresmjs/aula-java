package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdhomens, qtdmulheres;
        double maior, menor, alturafemMedia, alturafemtotal;

        System.out.print("Quantas pessoas serão cadastradas? ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n]; 

        for (int i = 0; i < n; i++ ) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        maior = altura[0];
        menor = altura[0];

        // - METODO DO PROFESSOR
        // for (int i = 1; i < n; i++) {
	    //     if (altura[i] > maior {
	    //         maior = altura[i];
	    //     }
	    //     if (altura[i] < menor) {
	    //         menor = altura[i];
	    //     }
	    // } 

        for (int i = 0; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }

        qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                qtdhomens++;
            }
            else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + altura[i];
            }
        }

        alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
	    System.out.printf("Numero de homens = %d\n", qtdhomens);


        sc.close();
    }
}
